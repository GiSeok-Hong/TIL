# Redux

>A predictable state container for JavaScript apps
>
>리덕스는 애플리케이션의 복잡성을 획기적으로 낮춰서 우리의 코드가 어떤 결과를 가져올지 예측 가능하게 만들어주는 도구
>
>리덕스의 특징은 단 하나의 진실의 원천? (Single Source of Truth)
>
>ex)  state = {}
>
>state = {
>
>​		contents:[
>
>​				{id:1, title:'HTML', desc:'HTML is....'},
>
>​				{id:2, title:'CSS', desc:'CSS is...'}
>
>​		],
>
>​		selected_id:2
>
>}
>
>undo, redo 처리가 편리
>
>
>
>2. 리덕스 : 추상적
>
>Redux   -->   action   -->   dispatch   -->   reducer   -->   state  <-->  Get state  <-->  render  --> 
>
>​                                            └-> subscribe   <------------------------------------------------------>┘
>
>
>
>3. 리덕스의 핵심 :  store
>
>   store : 정보가 저장되는 곳
>
>   	* state : 실제 정보가 저장이 됨.  직접 접속하는 것이 금지
>   	* reducer :  store를 만들 때 반드시 reducer 라는 함수를 만들어서 공급해줘야 한다. state를 입력값으로 받고 action을 참조해서 새로운 state 값을 만들어 return 한다
>    * dispatch :  
>      1.  reducer 를 호출해서 state 값을 바꾼다. 그후 subscribe 를 이용해서 render 함수를 호출
>      2. 
>    * subscribe : render 함수를 등록해 두면 state의 값이 변할 때 마다 render 함수가 호출되면서 ui가 새롭게 갱신되게 한다.
>    * getState : state 값을 불러와서 render에게 줌
>
>   
>
>   render :  store 밖에 있음. ui를 만들어 주는 역할을 하는 우리가 짤 코드. state의 값을 참조해서 ui를 만든다



* Redux가 좋은 가장 중요한 이유

>1. 기존 복잡했던 로직을 단순화 가능
>2. 시간 여행 가능
>
>





* Redux가 없다면

>Redux를 사용할 때와 다르게 많은 코드가 필요
>
>