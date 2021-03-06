import React, { useState, useCallback } from 'react';
import Link from 'next/link';
import { Form, Input, Button } from 'antd'
import { useDispatch, useSelector } from 'react-redux';
import { loginRequestAction } from '../reducers/user';

// Custom hook
export const useInput = (initValue = null) => {
	const [value, setter] = useState(initValue);
	const handler = useCallback((e) => {
		setter(e.target.value);
	}, []);

	return [value, handler];
}

const LoginForm = () => {
	const dispatch = useDispatch();
	const { isLoggingIn } = useSelector(state => state.user);

	const [id, onChangeId] = useInput('');
	const [pass, onChangePass] = useInput('');

	const onSubmitForm = useCallback((e) => {
		e.preventDefault();
		dispatch(loginRequestAction({
			id,
			pass
		}))
	}, [id, pass]);

	return (
		<>
			<Form onSubmit={onSubmitForm} style={{ padding: '10px' }}>
				<div>
          <label htmlFor="user-id">ID</label>
					<br/>
					<Input name="user-id" required value={id} onChange={onChangeId}/>
				</div>
        <div>
          <label htmlFor="user-pass">Password</label>
          <br/>
          <Input name="user-pass" type="password" required value={pass} onChange={onChangePass}/>
        </div>
				<div style={{marginTop: '10px' }}>
					<Button type="primary" htmlType="submit" loading={isLoggingIn}>LogIn</Button>
					<Link href="/signup"><a><Button>SignUp</Button></a></Link>
				</div>
			</Form>
		</>
	)
}

export default LoginForm; 