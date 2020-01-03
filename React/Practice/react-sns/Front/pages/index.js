import React from 'react';
import PostForm from '../components/PostForm';
import PostCard from '../components/PostCard';

const mock = {
  isLoggedIn: true,
  imagePaths: [],
  mainPosts: [{
    User: {
      id: 1,
      nickname: 'Hong is Happy index',
    },
    content: '첫번째 카드',
    img: 'https://t1.daumcdn.net/cfile/tistory/99C98B505CB7BF252D',
  }],
};

const Home = () => {
  return(
    <>
      <div>
        {/* main 화면인데 isLoggedIn 이 true면 PostForm을 보여줌 */}
        {mock.isLoggedIn && <PostForm imagePaths={mock.imagePath}/>}
        {/* 로그인과 상관 없이는 PostCard를 보여줌*/}
        {
          mock.mainPosts.map((v) => {
            return <PostCard key={v} post={v} />
          })
        }
      </div>
    </>
  )
}

export default Home;