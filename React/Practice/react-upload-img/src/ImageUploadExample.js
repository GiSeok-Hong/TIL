import React, { useState } from 'react';
import './test.css';

function ImageUploadExample() {
  // 파일을 미리 볼 url을 저장해줄 state
  const [fileImage, setFileImage] = useState("");

  // 파일 정보 저장
  const saveFileImage = (e) => {
    setFileImage(URL.createObjectURL(e.target.files[0]));
    // URL.createObjectURL() 함수는 지정한 object의 참조 URL을 담은 DOMString을 반환
  };

  // 파일 삭제
  const deleteFileImage = () => {
    URL.revokeObjectURL(fileImage);
    // URL.revokeObjectURL() 함수는 URL.createObjectURL()을 통해 생성한 객체 URL을 해제한다.
    setFileImage("");
  };

  return (
    <div className='test-box'>
      <h3>이미지 미리보기</h3>
      <p>최소 100px X 100px 사이즈의 이미지 파일을 등록해주세요</p>

      {/* 아래가 사진 미리보기 코드 */}
      <div className='imgPreview'>
        {fileImage && (<img alt='sample' src={fileImage} className='imgtest' />)}
        <p>{ fileImage }</p>
      </div>


      <div>
        <input type='file' accept='image/*' multiple name="imgUpload" onChange={saveFileImage} />
      </div>

      <button style={{ backgroundColor: "gray", color: "white", width: "55px", height: "40px", cursor: "pointer", margin:"10px"}} onClick={() => deleteFileImage()}>삭제</button>
    </div>
  );
}

export default ImageUploadExample;