# 지하철 노선도 미션
[ATDD 강의](https://edu.nextstep.camp/c/R89PYi5H) 실습을 위한 지하철 노선도 애플리케이션

## 1단계 - 지하철 구간 추가 기능 개선

1. 역 사이에 새로운 역을 등록할 경우

- **상행역 기준으로 추가**   
  기존 구간 A-C에 신규 구간 A-B를 추가하는 경우 A역을 기준으로 추가

- **하행역 기준으로 추가**  
  기존 구간 A-C에 신규 구간 B-C를 추가하는 경우 B역을 기준으로 추가

### 예외케이스

- 역 사이에 새로운 역을 등록할 경우 기존 역 사이 길이보다 크거나 같으면 등록을 할 수 없음
- 상행역과 하행역이 이미 노선에 모두 등록되어 있다면 추가할 수 없음
- 상행역과 하행역 둘 중 하나도 포함되어있지 않으면 추가할 수 없음
