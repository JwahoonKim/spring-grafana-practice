# spring-grafana-practice
비지니스 지표를 프로메테우스와 그라파나를 이용하여 모니터링 해보기

## 실행 방법
1. ./gradlew build
2. docker-compose up --build -d
를 하면..
- springboot, prometheus, grafana가 뜨게 되고
- prometheus가 springboot의 지표를 스크래핑하며
- grafana가 prometheus에 쌓인 데이터를 시각화하여 보여준다. 

grafana에서 확인하기 위해서는 localhost:3000으로 접속한 뒤 대시보드를 적절히 만들어주면 된다.

## 지표 확인 실습
<img width="455" alt="image" src="https://github.com/user-attachments/assets/96b08c7c-6865-4fc8-92be-b3bb64eb1024">


위와 같은 형식으로 counter 지표를 쌓고 있고 해당 service를 실행시키는 controller를 호출하면 jahni.apply 라는 지표가 프로메테우스용 마이크로미터에 의해 jahni_apply_total로 변경되어 집계된다.
따라서 이 지표를 이용해 그라파나에서 대시보드를 만들면 아래와 같이 시각화할 수 있다.

<img width="1062" alt="image" src="https://github.com/user-attachments/assets/e1d1c0b6-82cd-4130-bbac-931cb9ab0536">
