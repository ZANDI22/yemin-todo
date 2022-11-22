# 예민(YEMIN)한 TODO
```markdown
💡 본 프로젝트는 Spring Boot와 React를 사용해서 제작된 TODO 사이트 입니다.
```

## ✨ Git 컨벤션

### Commit 메세지 작성 방법
[`Git 커밋 메세지 작성시 참조`](https://velog.io/@shin6403/Git-git-%EC%BB%A4%EB%B0%8B-%EC%BB%A8%EB%B2%A4%EC%85%98-%EC%84%A4%EC%A0%95%ED%95%98%EA%B8%B0)
- **타입은 태그와 제목으로 구성되고, 태그는 영어로 쓰되 첫 문자는 대문자로 한다.** <br>
- **깃모지를 사용해서 어떤 유형의 작업인지 직관적으로 확인할 수 있게 작성한다.**


`[깃모지] Feat: [내용]` 형식으로 작성한다.

- `Feat` : 새로운 기능 추가
- `Fix` : 버그 수정
- `Docs` : 문서 수정
- `Style` : 코드 포맷팅, 세미콜론 누락, 코드 변경이 없는 경우
- `Refactor` : 코드 리펙토링
- `Test` : 테스트 코드, 리펙토링 테스트 코드 추가
- `Chore` : 빌드 업무 수정, 패키지 매니저 수정

### 😗 Git Emoji
[`Gitmoji 사용법 정리`](https://inpa.tistory.com/m/entry/GIT-%E2%9A%A1%EF%B8%8F-Gitmoji-%EC%82%AC%EC%9A%A9%EB%B2%95-Gitmoji-cli)

|이모지|코드|설명|
|:-:|:-:|:-:| 
|✨|`:sparkles:`|새 기능|
|🎨|`:art:`|코드의 구조/형태 개선|
|🔥|`:fire:`|코드/파일 삭제|
|📝|`:memo:`|문서 추가/수정|
|💡|`:bulb:`|주석 추가/수정|
|🙈|`:see_no_evil:`|.gitignore 추가/수정|
|➕|`:heavy_plus_sign:`|의존성 추가|
|➖|`:heavy_minus_sign:`|의존성 제거|
|🔀|`:twisted_rightwards_arrows:`|브랜치 병합|
|💄|`:lipstick:`|UI/스타일 파일 추가/수정|
|🐛|`:bug:`|버그 수정|
|✅|`:white_check_mark:`|테스트 추가/수정|

### 🔀 Git Branch 전략
#### 브랜치 이름 작성 방법
- 브랜치 이름은 작업 유형에 맞는 이름을 골라서 생성한다. <br>
  ex ) 회원 기능 개발 브랜치 → `feature/member`
#### git-flow 전략을 사용해서 브랜치를 관리
[`우아한 형제들 - git-flow 전략 정리글`](https://techblog.woowahan.com/2553/)

- `master` : 제품으로 출시될 수 있는 브랜치
- `develop` : 다음 출시 버전을 개발하는 브랜치
- `feature` : 기능을 개발하는 브랜치
- `release` : 이번 출시 버전을 준비하는 브랜치
- `hotfix` : 출시 버전에서 발생한 버그를 수정 하는 브랜치
