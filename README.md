## Iterator 패턴 (순서대로 지정해서 처리)
- Iterator 패턴이란, 무엇인가 많이 모여있는 것들을 순서대로 지정하면서 전체를 검색하는 처리를 실행하기 위한 것
- for문을 이용하면 좋을텐데 왜 외부에 Iterator 역할 같은 것을 만들어서 사용 할까?
  - Iterator를 사용함으로써 구현과 분리해서 하나씩 셀 수 있기 때문이다.
- 관련 패턴
  - Visitor : Iterator 패턴은 집합체에서 하나씩 요소를 꺼내서 세는 것이다. Visitor 패턴을 사용하면 하나씩 세면서 동시에 정해진 처리가 가능하다.
  - Composite : 재귀적인 구조를 갖는 패턴
  - Factory Method : Iterator 인스턴스를 작성할 때 Factory Method 패턴이 사용되는 경우도 있다.
![46610362-83d8b700-cb45-11e8-9ab8-e673f4326976](https://user-images.githubusercontent.com/7076334/46743294-b1f3fd80-cce3-11e8-9be0-0ac977570621.png)

## Adapter 패턴 (바꿔서 재이용)
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

## Template Method 패턴 (하위 클래스에서 구체적으로 처리하기)
- 상위 클래스에서 처리의 뼈대를 결정하고, 하위 클래스에서 그 구체적인 내용을 결정하는 디자인 패턴
- Template Method에 final을 사용하면 하위 클래스에서 오버라이드 할 수 없다.
- Template Method를 사용하면 어떤 이점이 있을까?
  - 상위 클래스의 템플릿 메소드에서 알고리즘이 기술되어 있으므로, 하위 클래스측에는 알고리즘을 일일이 기술할 필요가 없다. (로직은 공통화)
  - "상위 클래스형의 변수에 하위 클래스의 어떠한 인스턴스를 대입해도 제대로 작동할 수 있어야 한다. (LSP)"
- 관련 패턴
  - Factory Method : Template Method 패턴을 인스턴스 생성에 응용한 전형적인 예
  - Strategy
    - Template Method 패턴은 '상속'을 이용해서 프로그램의 동작을 변경할 수 있다. 상위 클래스에서 프로그램 동작의 큰 흐름을 결정하고, 하위 클래스에서 구체적인 흐름을 결정한다.
    - Strategy 패턴은 '위임'을 이용해서 프로그램의 동작을 변경할 수 있다. Strategy는 프로그램의 일부분을 변경하기 보다는 알고리즘 전체를 완전히 변경하고 있다.
- 상위 클래스에서 기술을 많이 하면 하위 클래스에서는 기술하기 편하게 되지만, 하위 클래스의 자유는 줄어들게 된다. 반대로 상위 클래스에서 기술을 적게하면 하위 클래스의 기술이 어렵게 되고, 각각의 하위 클래스에서 처리가 중복될지도 모른다.

![420px-template_method_uml_class_diagram svg](https://user-images.githubusercontent.com/7076334/46735610-ac8db780-ccd1-11e8-8f96-dd50819be1c6.png)

## Factory Method 패턴 (하위 클래스에서 인스턴스 작성하기)
- 인스턴스를 생성하는 공장을 Template Method 패턴으로 구성한 것이 Factory Method 패턴이다.
- 인스턴스 생성을 위한 골격(framework)과 실제의 인스턴스 생성의 클래스를 분리할 수 있다.
- Factory Method를 사용하면 어떤 이점이 있을까?
  - 결합도는 클래스의 변경점이 생겼을 때 얼마나 다른 클래스에 영향을 주는가이다.
  - Factory Method 패턴을 사용하면 직접 객체를 생성해 사용하는 것을 방지하고 서브클래스로 위임하기 때문에 보다 효율적인 코드 제어를 할 수 있고 의존성을 제거한다.
- 관련 패턴
  - Template Method : Factory Method 패턴은 Template Method 패턴의 전형적인 응용이다.
  - Singleton : Creator 역할을 수행하는 클래스는 대부분 Singleton 패턴으로 만들 수 있다. 프로그램 안에서 인스턴스가 복수로 존재할 필요는 거의 없기 때문이다.
  - Composite : Product 역할에 Composite 패턴을 적용할 수도 있다.
  - Iterator : Iterator 패턴에서 iterator 메소드가 Iterator의 인스턴스를 작성할 때 Factory Method 패턴이 사용되는 경우가 있다.

![46737556-c382d880-ccd6-11e8-8e5e-b6222bee1500](https://user-images.githubusercontent.com/7076334/46743237-95f05c00-cce3-11e8-91e6-f7687d4f5f85.png)

## Singleton (인스턴스 한 개만 만들기)
- 지정한 클래스의 인스턴스가 '절대로' 1개밖에 존재하지 않는 것을 '보증'하고 싶을 때
- 인스턴스가 1개밖에 존재하지 않는 것을 프로그램 상에서 표현하고 싶을 때
- Singleton을 사용하면 어떤 이점이 있을까?
  - 복수의 인스턴스가 존재하면 인스턴스들이 서로 영향을 미치고, 뜻하지 않은 버그가 발생할 가능성이 있다. 그러나 인스턴스가 1개 밖에 없다라는 보증이 있으면 그 전제조건 아래에서 프로그래밍 할 수 있다.
  - 한번의 new로 인스턴스를 사용하기 때문에 메모리 낭비를 방지할 수 있다. (쓰레드풀, 캐시, 로그 등, 커넥션풀, 환경설정 클래스등 공통된 객체를 여러개 생성해서 사용해야 하는 상황서 많이 사용)
- 관련 패턴 (인스턴스가 하나인 경우가 많다.)
  - Abstract Facctory, Builder, Facade, Prototype

![1200px-singleton_uml_class_diagram svg](https://user-images.githubusercontent.com/7076334/46743175-735e4300-cce3-11e8-9d71-d3c314124e16.png)

## Prototype (Java는 java.lang.Cloneable 인터페이스를 구현할 필요가 있다.)
- Prototype을 사용하면 사용하면 어떤 이점이 있을까?
  - 종류가 너무 많아 클래스로 정리되지 않는 경우
    - 종류가 많은 경우 각각의 클래스를 만들면 킄래스의 수가 너무 많아지기 때문에 소스 프로그램을 관리하기 힘들다.
  - 클래스로부터 인스턴스 생성이 어려운 경우
    - 그림판에서 복잡한 그림을 그린 후, Copy & Paste
  - framework와 생성할 인스턴스를 분리하고 싶은 경우
    - 인스턴스의 복사(clone)를 실행하는 부분을 (Prototype, Client) framework로 설정하고, 구체적인 구현부 (Concreate Prototype)를 분리해서 의존도를 줄일 수 있다. 
    - Client에서 Concreate Prototype을 구체적으로 선언할 필요가 없다.
- 관련 패턴
  - Flyweight : Prototpye 패턴에는 현재의 인스턴스와 같은 상태의 별도 인스턴스를 만들어 이용하지만, Flyweight 패턴에는 하나의 인스턴스를 복수의 장소에서 공유해서 사용한다.
  - Memento : Memento 패턴은 스냅샷과 undo를 실행하기 위해 현재의 인스턴스 상태를 저장한다. (실행취소)
  - Composite : Composite, Decorator 패턴을 많이 사용하면 복잡한 구조의 인스턴스가 동적으로 만들어지는데 이런 경우 Prototpye 패턴을 사용하면 편리하다.
  - Command : Command 패턴에 등장하는 명령을 복제하고 싶은 경우 Prototpye 패턴을 사용한다.
  
![1_zz5_u5kmjusw5wsbp9gmgw](https://user-images.githubusercontent.com/7076334/46749404-99d6ab00-ccf0-11e8-9ecf-8e8b5ed526d1.png)

## Builder (복잡한 인스턴스 조립하기)
- Builder를 사용하면 사용하면 어떤 이점이 있을까?
  - Director 클래스가 자신이 이용하고 있는 ConcreteBuilder를 모르기 때문에 자유롭게 교체할 수 있다.
- 관련 패턴
  - Template Method : Builder 패턴에서는 Director 역할이 Builder를 제어한다. Template Method 패턴에서는 상위 클래스가 하위 클래스를 제어한다. (templateMethod)
  - Composite : Builder 패턴에 의해 만들어진 생성물은 Composite 패턴이 되는 경우가 있다.
  - Abstract Factory : Builder 패턴도, Abstract Factory 패턴도 복잡한 인스턴스를 생성한다.
  - Facade : Builder 패턴의 Director 역할은Builder 역할의 복잡한 메소드를 조합해서 인스턴스를 구축하는 단순한 인터페이스(API)를 외부에 제공하는 것이다. Facade 패턴의 Facade 역할은 내부 모듈을 조합해서 작업하기 위한 단순한 인터페이스(API)를 외부에 제공한다.

![700px-builder_uml_class_diagram svg](https://user-images.githubusercontent.com/7076334/46916191-1ec40c00-cff2-11e8-8662-263b7259c92b.png)

## Abstract Factory (관련 부품을 조합해서 제품 만들기)
- 추상적인 공장에서는 추상적인 부품을 조합해서 추상적인 제품을 만든다.
- Template Meethod, Builder 패턴과 같이 Abstract Factory 패턴에서도 하위 클래스 단계에서 구체적인 구현을 실행한다.
- Abstract Factory를 사용하면 사용하면 어떤 이점이 있을까?
  - ConcreteFactory를 새로 추가하는것이 간단하다. (Client에서는 AbstractFactory와 AbstractProduct만 참고 하기 때문에)
  - 하지만 Abstract Factory에 부품을 (Abstract Product)을 추가하는 것은 영향도가 높아서 수정범위가 높아진다.
- 관련 패턴
  - Builder : Abstract Factory 패턴은 인터페이스(API)가 정해져 있는 추상적인 부품을 조합하여 복잡한 구조를 가진 인스턴스를 만든다.
  Builder 패턴은 단계적으로 큰 인스턴스를 만든다.
  - Factory Method : Abstract Factory 패턴에서 제품이나 부품을 만드는 부분에 Factory Method 패턴으로 되는 경우가 있다.
  - Composite : Abstract Factory 패턴에서 만들어진 제품이 Composite 패턴으로 되는 경우가 있다.
  - Singleton : Abstract Factory 패턴의 구체적인 공장이 Singleton 패턴으로 되는 경우가 있다.

![677px-abstract_factory_uml svg](https://user-images.githubusercontent.com/7076334/46916822-d4935880-cffa-11e8-8df4-71ada9e65c00.png)

## Bridge (기능 계층과 구현 계층 분리하기)

![750px-bridge_uml_class_diagram svg](https://user-images.githubusercontent.com/7076334/46918131-07444d80-d009-11e8-9e81-6ebb02bcb3b1.png)

