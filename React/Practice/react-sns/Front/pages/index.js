import React from 'react';
import PostForm from '../components/PostForm';
import PostCard from '../components/PostCard';
import { useSelector } from 'react-redux';

const Home = () => {
  const { isLoggedIn } = useSelector(state => state.user);
  const { mainPosts } = useSelector(state => state.post);

  return(
    <div>
      {/* main 화면인데 isLoggedIn 이 true면 PostForm을 보여줌 */}
      {isLoggedIn && <PostForm />}
      {/* 로그인과 상관 없이는 PostCard를 보여줌*/}
      {
        mainPosts.map((v) => {
          return <PostCard key={v} post={v} />
        })
      }
    </div>
  )
}

export default Home;