# GIT

* 새로운 저장소 만들기

  ```bash
  $ git init
  ```

* 저장소 받아오기

  ```bash
  # 로컬 저장소 복제
  $ git clone /로컬/저장소/경로
  
  # 원격 저장소 복제
  $ git clone 사용자명@호스트:/원격/저장소/경로
  ```

* 변경된 파일 **인덱스**에 추가하기

  ```bash
  # 원하는 파일
  $ git add <파일 이름>
  
  # 변경된 모든 파일
  $ git add .
  # 또는
  $ git add *
  ```

* 변경 내용 **확정**하기 (HEAD에 반영된다.)

  ```bash
  $ git commit -m "변경에 대한 내용"
  ```

* 변경 내용 **발행**하기 (원격 서버에 올리기)

  ```bash
  # origin은 원격 서버  master는 로컬 서버
  $ git push origin master
  ```

* branch **생성** 및 **이동**하기

  ```bash
  $ git branch <branch 명>
  ```

  ```bash
  $ git checkout <branch 명>
  ```

  ```bash
  # branch 생성 및 이동 한 번에 하기
  $ git checkout -b <branch 명>
  ```

* branch **삭제**하기

  ```bash
  $ git branch -d <branch 명>
  ```

* local의 branch를 원격 저장소에 보내기

  ```bash
  $ git push origin <branch 명>
  ```

* 원격 저장소의 branch 가져오기

  ```bash
  $ git remote update
  ```

  ```bash
  # local에 동일한 이름의 branch가 생성되면서 checkout 된다.
  $ git checkout -t <원격 저장소 브런치 이름>
  ```

* branch 리스트 보기

  ```bash
  $ git branch

  $ git branch -r  
  ```





#### Git 커밋 메시지 구성
1. 모든 커밋 메시지는 다음과 같이 세 영역으로 구성되며, 각 영영은 빈 줄로 분리된다.
제목 줄
본문 (제목 만으로 표현이 가능할 때에는 생략 가능)
꼬리말 (관련 이슈가 없으면 생략 가능)

##### 제목 작성
1. 제목 줄은 50자 내로 작성
2. 제목 줄은 "유형: 제목" 의 형식으로 작성
3. 유형은 다음 중 하나를 사용

**기능** : 기능 추가, 삭제, 변경 (제품 코드 수정 발생)

**버그** : 버그 수정 (제품 코드 수정 발생)

**리팩토링** : 코드 리팩토링 (제품 코드 수정 발생)

**형식** : 코드 형식, 정렬, 주석 등의 변경 (제품 코드 수정 발생, 하지만 동작에 영향을 주는 변경은 없음)

**테스트** : 테스트 코드 추가, 삭제, 변경 등 (제품 코드 수정 없음, 테스트 코드에 관련된 모든 변경에 해당)

**문서** : 문서 추가, 삭제, 변경 (코드 수정 없음)

**기타** : 위에 해당되지 않는 모든 변경(예 : 빌드 스크립트 수정, 패키지 배포 설정 변경 등) 을 포함 (코드 수정 없음)
위 유형들이 복합적으로 포함되어 있는 경우 되도록 커밋을 분리한다. 분리가 어려운 경우에는 위 순서 상 상위 항목의 유형으로 작성한다.

4. 제목은 개조식 구문으로 작성
예) "기능: 로그 출력 기능 추가"

##### 본문
1. 본문은 한 줄 당 72자 내로 작성
2. 본문 내용은 양에 구애받지 않고 최대한 상세히 작성
3. 본문 내용은 어떻게 변경했는지 보다 무엇을 변경했는지 또는 왜 변경했는지를 설명한다.

##### 꼬리말
1. 꼬리말에는 이슈 트래커를 작성한다.
2. 꼬리말은 "유형: #이슈번호" 형식으로 작성한다.
예) 해결: #123
3. 이슈 트래커 유형은 다음 중 하나를 사용

**해결** : 이슈 해결 시 사용

**관련** : 해당 커밋에 관련된 이슈번호 (아직 해결되지 않은 경우)

**참고** : 참고할 이슈가 있을 때 사용








#### [참고]

[Github - Git bash 터미널 계정 변경 참고](https://meaownworld.tistory.com/78)

[Git 사용 규칙](https://tttsss77.tistory.com/58)

[누구나 쉽게 이해할 수 있는 Git 입문](https://backlog.com/git-tutorial/kr/intro/intro1_1.html)

[Git 간편 안내서](https://rogerdudler.github.io/git-guide/index.ko.html)

[우아한형제들 기술블로그](http://woowabros.github.io/experience/2017/10/30/baemin-mobile-git-branch-strategy.html)

