// next JS에서 제공하는 형태?로 root를 담당한다.
import React from 'react';
import Head from 'next/head';
import PropTypes from 'prop-types';
import AppLayout from '../components/AppLayout';

const HongSns = ({ Component }) => {
  return (
    <>
      <Head>
        <title>Hong Sns</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/antd/3.20.5/antd.css" />
      </Head>
      <AppLayout>
        <Component/>
      </AppLayout>
    </>
  )
}

// 타입 선언
HongSns.propTypes = {
  Component: PropTypes.elementType
}

export default HongSns;