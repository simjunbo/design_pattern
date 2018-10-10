## Iterator 패턴
- Iterator 패턴이란, 무엇인가 많이 모여있는 것들을 순서대로 지정하면서 전체를 검색하는 처리를 실행하기 위한 것
- for문을 이용하면 좋을텐데 왜 외부에 Iterator 역할 같은 것을 만들어서 사용 할까?
  - Iterator를 사용함으로써 구현과 분리해서 하나씩 셀 수 있기 때문이다.
- 관련 패턴
  - Visitor : Iterator 패턴은 집합체에서 하나씩 요소를 꺼내서 세는 것이다. Visitor 패턴을 사용하면 하나씩 세면서 동시에 정해진 처리가 가능하다.
  - Composite : 재귀적인 구조를 갖는 패턴
  - Factory Method : Iterator 인스턴스를 작성할 때 Factory Method 패턴이 사용되는 경우도 있다.
![1000px-iterator_uml_class_diagram svg](https://user-images.githubusercontent.com/7076334/46610362-83d8b700-cb45-11e8-9ab8-e673f4326976.png)

## Adapter 패턴
- 제공되고 있는 것과 필요한 것 사이를 연결해주는 것이 어뎁터 패턴의 역할이다.
- '이미 제공되어 있는 것'과 '필요한 것' 사이의 '차이'를 없애주는 디자인 패턴
- Adapter 패턴은 Wrapper 패턴으로 불리기도 한다.
- Adapter 패턴은 두가지 종류가 있다.
  - 클래스에 의한 Adapter 패턴(상속을 위한 Adapter 패턴)
  - 인스턴스에 의한 Adapter 패턴(위임을 사용한 Adapter 패턴)
- 어떤 경우에 사용할까?
  - Adpater 패턴은 기존의 클래스를 개조해서 필요한 클래스를 만든다.
  - 만약 버그가 발생해도 기존의 클래스 (Adaptee의 역할)에는 버그가 없으므로 Adapter 역할의 클래스를 중점적으로 조사하면 된다.
  - 기존의 클래스를 전혀 수정하지 않고 목적한 인터페이스(API)에 맞출 때
  - 구 버전과 신 버전을 공존시키고, 유지와 보수도 편하게 하기 위할 때
- 관련 패턴
  - Bridge : Adapter 패턴은 인터페이스(API)가 서로 다른 클래스들을 연결하는 패턴이지만, Bridge 패턴은 기능의 계층과 구현의 계층을 연결 시키는 패턴이다.
  - Decorate : Adapter 패턴은 인터페이스(API)의 차이를 조정하기 위한 패턴이지만, Decorator 패턴은 인터페이스(API)를 수정하지 않고 기능을 추가 하는 패턴이다.
### 1) ClassAdapter 패턴 (상속)
![classadapter](https://user-images.githubusercontent.com/7076334/46731986-28363700-ccc7-11e8-981a-c11c5be1f578.png)

### 2) ObjecetAdapter (위임)
![objectadapter](https://user-images.githubusercontent.com/7076334/46731987-2a989100-ccc7-11e8-9775-70b30c4927d2.png)

## Template Method 패턴
- 상위 클래스에서 처리의 뼈대를 결정하고, 하위 클래스에서 그 구체적인 내용을 결정하는 디자인 패턴
- Template Method를 사용하면 어떤 이점이 있을까?
  - 상위 클래스의 템플릿 메소드에서 알고리즘이 기술되어 있으므로, 하위 클래스측에는 알고리즘을 일일이 기술할 필요가 없다. (로직은 공통화)
  - "상위 클래스형의 변수에 하위 클래스의 어떠한 인스턴스를 대입해도 제대로 작동할 수 있어야 한다. (LSP)"
- 관련 패턴
  - Factory Method : Template Method 패턴을 인스턴스 생성에 응용한 전형적인 예
  - Strategy
    - Template Method 패턴은 '상속'을 이용해서 프로그램의 동작을 변경할 수 있다. 상위 클래스에서 프로그램 동작의 큰 흐름을 결정하고, 하위 클래스에서 구체적인 흐름을 결정한다.
    - Strategy 패턴은 '위임'을 이용해서 프로그램의 동작을 변경할 수 있다. Strategy는 프로그램의 일부분을 변경하기 보다는 알고리즘 전체를 완전히 변경하고 있다.
![420px-template_method_uml_class_diagram svg](https://user-images.githubusercontent.com/7076334/46735610-ac8db780-ccd1-11e8-8f96-dd50819be1c6.png)
