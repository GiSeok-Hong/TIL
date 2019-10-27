import React, { Component } from 'react';
import { connect } from 'react-redux';
import Counter from '../components/Counter';
import { increment, decrement } from '../store/modules/counter';


// 리덕스와 연동된 컴포넌트를 컨테이너 컴포넌트라 부름
// 3. store와 reducer를 연결시킬 수 있도록 만들어진 컴포넌트 생성
class CounterContainer extends Component {
    handleIncrement = () => {
        this.props.increment() ;
    } ;

    handleDecrement = () => {
        this.props.decrement () ;
    } ;

    render() {
        const { number } = this.props ;
        return (
            <Counter 
                value={number}
                onIncrement={this.handleIncrement}
                onDecrement={this.handleDecrement}
            />
        ) ;
    } 
}


// 2. store에 state를 view에 전달해주는 역할
const mapStateToProps = ({ counter }) => ({
    number: counter.number,
}) ;

// 1. 액션을 스토어에 전달하는 역할인 dispatch 생성
const mapDispatchToProps = {increment, decrement} ;

// 스토어와 연결
export default connect (
    mapStateToProps,
    mapDispatchToProps
)(CounterContainer) ;