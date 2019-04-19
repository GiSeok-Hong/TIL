## Parameter VS HyperParameter

### Parameter

모델 내부에서 확인이 가능한 변수. 데이터를 통해서 산출이 가능한 값.

1. 예측을 수행할 떄, 모델에 의해 요구되어지는 값

2. Parameter 가 모델의 능력을 결정

3. Parameter 는 측정되거나 데이터로부터 학습되어진다.

4. 주로 예측자에 의해 수작업으로 측정되지 않는다.

   EX) 1. 인공신경망에서의 가중치

             2. SVM 에서의 서포트 벡터
             3. 선형회귀나 로지스틱회귀분석에서의 결정계수

### Hyperparameter

모델에서 외적인 요소라고 할 수 있다. 데이터 분석을 통해 얻어지는 값이 아니다.

   1.모델의 parameter 값을 측정하기 위해 알고리즘 구현 과정에서 사용된다.

2. 주로 알고리즘 사용자에 의해 정해진다.

3. 경험에 의해 정해지기도 한다. 알고리즘을 여러 번 수행해보면서 최적의 값을 직감적으로 알게 됨

4. 예측 알고리즘 모델링의 문제점을 위해 조절된다.

   EX) 1. 신경망 학습에서 learning rate(학습률)

             2. SVM 에서의 코스트 값인 C
             3. KNN에서의 K의 개수



참고 사이트 <http://blog.naver.com/PostView.nhn?blogId=tjdudwo93&logNo=221067763334&parentCategoryNo=&categoryNo=&viewDate=&isShowPopularPosts=false&from=postView>



