import React from 'react';
import { Menu, Input, Row, Col } from 'antd';
import Link from 'next/link';
import PropTypes from 'prop-types';
import LoginForm from './LoginForm';
import UserProfile from './UserProfile';

const mock = {
  nickname: '홍기석 AppLayout',
  Post: [],
  Followings: [],
  Followers: [],
  isLoggedIn: false
};

const AppLayout = ({ children }) => {
  return (
    <div>
      <Menu mode="horizontal">
        <Menu.Item key="home"><Link href="/"><a>Hong SNS</a></Link></Menu.Item>
        <Menu.Item key="profile"><Link href="/profile"><a>Profile</a></Link></Menu.Item>
        <Menu.Item key="mail">
          <Input.Search enterButton style={{ verticalAlign: 'middle' }}/>
        </Menu.Item>
      </Menu>
      <Row gutter={8}>
        <Col xs={24} md={6}>
          {
            mock.isLoggedIn
            ? <UserProfile />
            : <LoginForm />
          }
        </Col>
        <Col xs={24} md={12}>{children}</Col>
        <Col xs={24} md={6}><Link href="https://github.com/GiSeok-Hong"><a target="_blank">Made by hong</a></Link></Col>
      </Row>
    </div>
  )
};

AppLayout.prototype ={
  children: PropTypes.node
}

export default AppLayout;