import React from 'react';
import Head from 'next/head';
import AppLayout from '../components/AppLayout';

const Profile = () => {
  return(
    <>
      <Head>
        <title>Hong SNS</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/antd/3.20.5/antd.css" />
      </Head>
      <AppLayout>
        <div>
          프로필!
        </div>
      </AppLayout>
    </>
  )
}

export default Profile;