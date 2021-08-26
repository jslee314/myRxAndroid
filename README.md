# [1] RxAndroid 소개
RxAndroid는 RxJava에 최소한의 클래스를 추가하여 안드로이드 앱에서 리액티브 구성 요소를 쉽고 간편하게 사용하게 만드는 라이브러리입니다. 
다음 특징을 통해 해결해준다. 

- 간단한 코드로 복잡한 병행(concurrency)프로그래밍을 할 수 있음
- 비동기 구조에서 에러를 다루기 쉬움
- 함수형 프로그래밍 기법도 부분적으로 적용할 수 있음

1. 리액티브 라이브러리와 API


2. 안드로이드 스튜디오 환경 설정



# [2] RxAndroid 기본
RxAndroid의 기본 개념은 RxJava와 동일합니다.
RxJava의 구조에 안드로이드의 각 컴포넌트를 사용할 수 있게 변경해 놓은 것입니다.
따라서 RxAndroid의 구송 요소는 다음처럼 RxJava의 구성 요소와 같습니다.
- Observable : 비즈니스 로직을 이용해 데이터 발행
- 구독자 : Observable에서 발생한 데이터를 구독
- 스케줄러 : 스케줄러를 통해서 Observable, 구독자가 어느 스레드에서 실행될지 결정


# [3] RxAndroid 활용
1) 리액티브 RecyclerView

RecyclerView 클래스
Adapter 클래스
LayoutManager 클래스

<예제: 설치된 앱 리스트 나열하기>

 

2) 안드로이드 스레드를 대체하는 RxAndroid

뷰와 뷰 그룹의 스레드 관리
AsyncTask 클래스에 RxAndroid 적용하기
RxAndroid를 이용하여 TimerTask 대체하기


3) REST API를 활용한 네트워크 프로그래밍

Volly 라이브러리 활용

Retrofit2 + OKHttp 활용하기

# [4] 메모리 누수

해결책 1: Disposable 인터페이스를 이용함여 명시적으로 자원 해제
해결책 2: RxLifecycle 라이브러리 이용
해결책 3:  CompositeDisposable 클래스 이용

