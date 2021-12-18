import React, { useState, useRef } from 'react';
import './test.css';

function ImageUploadExample() {
  // 파일을 미리 볼 url을 저장해줄 state
  const [fileImage, setFileImage] = useState("./defaultImage.png");

  // 파일 정보 저장
  const saveFileImage = (e) => {
    setFileImage(URL.createObjectURL(e.target.files[0]));
    // URL.createObjectURL() 함수는 지정한 object의 참조 URL을 담은 DOMString을 반환
    console.log('URL.createObjectURL(e.target.files[0]) = '  ,URL.createObjectURL(e.target.files[0]));
  };

  // 파일 삭제
  const deleteFileImage = () => {
    URL.revokeObjectURL(fileImage);
    // URL.revokeObjectURL() 함수는 URL.createObjectURL()을 통해 생성한 객체 URL을 해제한다.
    setFileImage("./defaultImage.png");
    console.log('URL.revokeObjectURL(fileImage) : ',fileImage);
  };


  const imgInput = useRef();

  function testRefFunction(e) {
    e.preventDefault();
    imgInput.current.click();
  } ;



  return (
    <div className='test-box'>
      <h2>이미지 미리보기</h2>
      <p>최소 100px X 100px 사이즈의 이미지 파일을 등록해주세요</p>

      {/* 아래가 사진 미리보기 코드 */}
      <div className='imgPreview'>
        {/* js 단축 평가  truthy falsy  &&는 앞의 문장이 참이면 실행 ||는 앞의 문장이 falsy면 뒷 문장 실행 */}
        {fileImage && (<img alt='sample' src={fileImage} className='imgtest' />)}
      </div>


      <div className='btn-area'>
        <input type='file' accept='image/*' multiple name="imgUpload" onChange={saveFileImage} ref={imgInput} />
        <button className='new-btn img-btn' onClick={ testRefFunction }>이미지 등록</button>
        <button className='del-btn img-btn' onClick={() => deleteFileImage()}>삭제</button>
      </div>
    </div>
  );
}

export default ImageUploadExample;