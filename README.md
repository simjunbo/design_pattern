## Iterator 패턴 (순서대로 지정해서 처리)
- Iterator 패턴이란, 무엇인가 많이 모여있는 것들을 순서대로 지정하면서 전체를 검색하는 처리를 실행하기 위한 것
- for문을 이용하면 좋을텐데 왜 외부에 Iterator 역할 같은 것을 만들어서 사용 할까?
  - Iterator를 사용함으로써 구현(Concrete)과 분리해서 하나씩 셀 수 있기 때문이다.
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
  - Adapter 패턴은 기존의 클래스를 개조해서 필요한 클래스를 만든다.
  - 만약 버그가 발생해도 기존의 클래스 (Adaptee의 역할)에는 버그가 없으므로 Adapter 역할의 클래스를 중점적으로 조사하면 된다.
  - 기존의 클래스를 전혀 수정하지 않고 목적한 인터페이스(API)에 맞출 때
  - 구 버전과 신 버전을 공존시키고, 유지와 보수도 편하게 하기 위할 때
- 관련 패턴
  - Bridge : Adapter 패턴은 인터페이스(API)가 서로 다른 클래스들을 연결하는 패턴이지만, Bridge 패턴은 기능의 계층과 구현의 계층을 연결 시키는 패턴이다.
  - Decorate : Adapter 패턴은 인터페이스(API)의 차이를 조정하기 위한 패턴이지만, Decorator 패턴은 인터페이스(API)를 수정하지 않고 기능을 추가 하는 패턴이다.
  
![adapter-pattern-overview](https://user-images.githubusercontent.com/7076334/52349955-e944a200-2a6a-11e9-8d20-6966df0df9ab.png)

### 1) ClassAdapter 패턴 (상속)
![classadapter](https://user-images.githubusercontent.com/7076334/52349972-f06bb000-2a6a-11e9-8022-2d48aff9cf38.jpg)

### 2) ObjecetAdapter (위임)
![objectadapter](https://user-images.githubusercontent.com/7076334/52349960-ec3f9280-2a6a-11e9-99d2-698ee71e5df6.jpg)

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
  - 한번의 new로 인스턴스를 사용하기 때문에 메모리 낭비를 방지할 수 있다. (쓰레드풀, 캐시, 로그 등, 커넥션풀, 환경설정 클래스등 공통된 객체를 여러개 생성해서 사용해야 하는 상황에서 많이 사용)
- 관련 패턴 (인스턴스가 하나인 경우가 많다.)
  - Abstract Facctory, Builder, Facade, Prototype

![1200px-singleton_uml_class_diagram svg](https://user-images.githubusercontent.com/7076334/46743175-735e4300-cce3-11e8-9d71-d3c314124e16.png)

## Prototype (Java는 java.lang.Cloneable 인터페이스를 구현할 필요가 있다.)
- Prototype을 사용하면 어떤 이점이 있을까?
  - 종류가 너무 많아 클래스로 정리되지 않는 경우
    - 종류가 많은 경우 각각의 클래스를 만들면 클래스의 수가 너무 많아지기 때문에 소스 프로그램을 관리하기 힘들다.
  - 클래스로부터 인스턴스 생성이 어려운 경우
    - 그림판에서 복잡한 그림을 그린 후, Copy & Paste
  - framework와 생성할 인스턴스를 분리하고 싶은 경우
    - 인스턴스의 복사(clone)를 실행하는 부분을 (Prototype, Client) framework로 설정하고, 구체적인 구현부 (Concrete Prototype)를 분리해서 의존도를 줄일 수 있다. 
    - Client에서 Concrete Prototype을 구체적으로 선언할 필요가 없다.
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
- 클래스 계층의 두 가지 역할
  - 기능의 클래스 계층
  - 구현의 클래스 계층
- 기능 클래스
  - 상위 클래스는 기본적인 기능을 가지고 있다. 하위 클래스에서 새로운 기능을 추가한다.
- 구현 클래스
  - 상위 클래스는 추상 메소드에 의해 인터페이스를 규정한다. 하위 클래스는 구상 메소드에 의해 그 인터페이스를 구현한다.
- 클래스 계층이 하나라면 기능의 클래스 계층과 구현의 클래스 계층이 하나의 계층구조 안에 혼재하게 된다.
  - '기능의 클래스 계층'과 '구현의 클래스 계층' 을 두 개의 독립된 클래스 계층으로 분리한다.
  - 단순 분리만 하면 안되기 때문에 두 개의 클래스 계층 사이에 다리를 놓는 일이 필요하다.
- 상속은 견고한 연결이고 위임은 느슨한 연결이다.
- Bridge를 사용하면 사용하면 어떤 이점이 있을까?
  - '기능의 클래스 계층'과 '구현의 클래스 계층'을 분리해두면 각각의 클래스 계층을 독립적으로 확장할 수 있다.
  - 기능을 추가하고 싶으면 기능의 클래스 계층에 클래스를 추가한다. 이때 구현의 클래스 계층은 전혀 수정할 필요가 없다.
- 관련 패턴
  - Template Method : Template Method 패턴에서는 구현의 클래스 계층을 이용한다. 상위 클래스에서는 추상 메소드를 사용해서 프로그래밍을 실행하고 하위 클래스에서는 그 추상 메소드를 구현한다.
  - Abstract Factory : Bridge 패턴에 등장하는 ConcreteImplementor 역할을 환경에 맞춰서 적절히 구축하기 위해 Abstract Factory 패턴이 이용되는 경우가 있다.
  - Adapter 패턴 : Bridge 패턴은 기능의 클래스 계층과 구현의 클래스 계층을 확실히 분리한 다음 결합 시키는 패턴이다. Adapter 패턴도 기능은 비슷하지만 인터페이스가 다른 클래스를 결합시키는 패턴이다.

![750px-bridge_uml_class_diagram svg](https://user-images.githubusercontent.com/7076334/46918131-07444d80-d009-11e8-9e81-6ebb02bcb3b1.png)

## Strategy (알고리즘을 모두 바꾸기)
- 알고리즘을 교체해서 같은 문제를 다른 방법으로도 쉽게 해결할 수 있도록 도와주는 패턴이 Strategy 패턴이다.
- Strategy 사용하면 사용하면 어떤 이점이 있을까?
  - 위임이라는 느슨한 연결을 사용하고 있으므로 알고리즘을 쉽게 교환할 수 있다.
  - 프로그램의 동작 중에도 알고리즘을 교체할 수 있다. (런타임)
- 관련 패턴
  - Flyweight : ConcreteStrategy 역할은 Flyweight 패턴을 사용해서 복수의 장소에서 공유할 수도 있다.
  - Abstract Factory : Strategy 패턴에서는 알고리즘을 모두 교체할 수 있다. Abstract Factory 패턴에서는 구체적인 공장, 부품, 제품을 모두 교체할 수 있다.
  - State : Strategy 패턴도 State 패턴도 둘다 위임하는 곳을 교환하는 패턴이고 클래스 간의 관계도 매우 비슷하지만 두 패턴의 목적이 다르다.
    - Strategy는 '알고리즘'을 표현하는 클래스를 작성해서 그것을 ConcreteStrategy 역할의 클래스로 처리한다. Strategy 패턴에서는 클래스를 교체할 수 있지만 필요하지 않으면 교체하지 않아도 된다.
    - State는 '상태'를 표현하는 클래스를 작성해서 그것을 ConcreteStrategy 역할의 클래스로 한다. State 패턴에는 상태가 변화할 때마다 위임하는 곳의 클래스가 반드시 교체된다.

![strategy](https://user-images.githubusercontent.com/7076334/46949583-e63d3480-d0bc-11e8-9ea8-d837b1cec09b.gif)

## Composite (그릇과 내용물을 동일시하기 - 폴더 구조)
- 일반적으로 트리 구조로 된 데이터 구조는 Composite 패턴에 해당한다.
- 사용자가 단일 객체와 복합 객체 모두 동일하게 다룬다.
- Composite 사용하면 사용하면 어떤 이점이 있을까?
  - 재귀형태로 동일한 자료형을 사용하기 때문에 구현이 줄어들고 새로운 클래스 추가에 용이하다.
  - 단일 객체처럼 행동하는 다수의 객체가 있는 경우 한꺼번에 처리할 수 있다.
- 관련 패턴
  - Command : Command 패턴에서 '매크로 커맨드'를 만들 때 Composite 패턴이 사용
  - Visitor : Visitor 패턴은 Composite를 순환하면서 처리하는데 사용
  - Decorator : Composite 패턴은 Composite, Leaf을 Component 역할로 동일시 한다. Decorator 패턴은 장식과 내용물을 동일시한다.
  
![480px-composite_uml_class_diagram_ fixed svg](https://user-images.githubusercontent.com/7076334/46953214-37065a80-d0c8-11e8-8f78-f95c58fcc3f7.png)

## Decorator (장식과 내용물을 동일시하기)
- Decorator 패턴과 Composite 패턴은 재귀적인 구조를 취하는  유사하지만 목적이 다르다.
  - Decorator 패턴은 테두리 장식을 중복해서 기능을 추가해가는 것에 주안점을 두기 때문이다.
- Decorator 사용하면 사용하면 어떤 이점이 있을까?
  - 내용물을 바꾸지 않고 기능을 추가할 수 있다.
  - 동적인 기능을 추가할 수 있다. (위임을 통한 느슨한 결합)
  - 단순한 장식이라도 다양한 기능을 추가할 수 있다. (ex 토핑)
  - 사용 되는곳 (java.io 패키지의 FileReader, BufferedReader 등)
- 반면 단점으로 유사한 성질의 작은 클래스가 많이 만들어지는 결점이 있다.
- 관련 패턴
  - Adapter : Decorator 패턴은 내용물의 인터페이스를 변경하지 않고 장식을 만든다. Adapter 패턴은 다른 두 개의 인터페이스를 연결하기 위해 이용한다.
  - Strategy : Decorator 패턴은 장식을 교체하거나 테두리 장식을 겹쳐서 기능을 추가한다. Strategy 패턴은 알고리즘을 교체해서 기능을 변경한다.

![400px-decorator_uml_class_diagram svg](https://user-images.githubusercontent.com/7076334/46956801-2e665200-d0d1-11e8-91d1-b49abfa56e6b.png)

## Visitor (데이터 구조를 돌아다니면서 처리하기)
- Visitor 패턴은 데이터 '구조'와 '처리'를 분리한다.
- 새로운 처리를 추가하고 싶을 때는 '방문자'를 만들면 된다.
- 더블 디스패치 (이중 분리)
  - accept(Visitor)와 visit(element)는 정확히 반대의 관계에 있다.
  - Visitor 패턴에는 ConreteElement 역할과 ConcreteVisitor 역할을 하는 한쌍에 의해 실제 처리가 결정된다.
- Visitor 사용하면 사용하면 어떤 이점이 있을까?
  - '반복 처리가 필요하면 데이터 구조 안에 루프를 사용하면 되지 어째서 accept나 visit 같은 복잡한 메소드를 호출 할까?'
  - Visitor 패턴의 목적은 처리를 데이터 구조에서 분리하는 일이다.
  - ConcreteVisitor는 ConcreteElement와는 독립적으로 개발할 수 있다.
- OCP (Open-Closed Principle) 확장에는 열려 있고, 수정에는 닫혀있다.
  - ConcreteVisitor 역할을 추가하는 것은 간단하다.(여러 클래스로) 처리를 위한 ConcreteElement 역할을 수정할 필요는 없기 때문이다.
  - ConcreteElement 역할의 추가는 곤란하다. 새로운 ConcreteElement가 추가된다면 ConcreteVisitor에 새로운 visit 메소드를 구현해야 된다.
- Visitor(처리), Element(구조)
- 관련 패턴
  - Iterator : Iterator와 Visitor 패턴 모두 어떤 데이터 구조 상에서 처리를 실행한다. Iterator는 데이터 구조가 지니고 있는 요소를 하나씩 얻는데 사용하지만, Visitor는 데이터 구조가 지니고 있는 요소에 특정한 처리를 실행하는데 사용
  - Composite : 방문처가 되는 데이터 구조는 Composite 패턴이 되는 경우가 많다. (재귀)
  - Interpreter : Interpreter 패턴에서 visitor 패턴이 사용되는 경우가 있다.

![515px-visitordiagram svg](https://user-images.githubusercontent.com/7076334/52636475-0f0cf380-2f10-11e9-87c5-077a268b3ad1.png)

## Chain of Responsibility (책임 떠넘기기)
- 어떤 요청이 발생했을 때 그 요청을 처리할 오브젝트를 직접 결정할 수 없는 경우, 복수의 오브젝트(객체)를 사슬(chain) 처럼 연결해 두면, 그 오브젝트(객체)의 사슬을 차례로 돌아다니면서 목적한 오브젝트(객체)를 결정하는 방법. (ex try-catch-finally)
- Chain of Responsibility 패턴의 포인트는 요구를 하는 사람 (Client)과 요구를 처리하는 사람(Concretehandler 역할)을 유연하게 연결하는 것이다.
- Chain of Responsibility 사용하면 사용하면 어떤 이점이 있을까?
  - Concretehandler가 '자신의 일에 집중할 수 있다.' (하나의 역할만 처리하면 된다.)
  - 해당 패턴을 사용하지 않는 경우 '위대한 사람 한명이 누가 요구를 처리해야할지 전부 결정' 해야 된다. (복잡해 진다.)
- 요구와 처리자의 관계가 고정적이고 처리 속도가 상당히 중요한 경우에는 Chain of Responsibility를 사용하지 않는 편이 유효한 경우도 있다.
- 관련 패턴
  - Composite : Handler 역할에 Composite 패턴이 자주 등장한다.
  - Command : Handler 역할에 대해서 제공되는 '요구'에는 Command 패턴이 사용되는 경우가 있다.
  
![chain](https://user-images.githubusercontent.com/7076334/47017037-29b2a400-d18c-11e8-9b1a-7ffc1fa8a0a1.gif)

## Facade (단순한 창구)
- 커다란 프로그램을 사용해서 처리를 실행하려면 상호 관련된 많은 클래스를 적절하게 제어해야 한다. 이럴 때 '창구'가 필요하다.
- Facade 패턴은 복잡하게 얽혀 잇는 것을 정리해서 높은 레벨의 인터페이스를 제공한다.
- Facade 사용하면 사용하면 어떤 이점이 있을까?
  - Facade는 복잡한 것을 단순하게 보여준다.
  - 핵심은 인터페이스(API)를 적게 하는 일이다. (클래스나 메소드가 많이 보이면, 프로그래머는 무엇을 사용하면 좋을지 망설이게 되고, 호출 하는 순서에도 주의해야한다.)
- 관련 패턴
  - Abstract Factory : 오브젝트(객체) 생성이라는 복잡한 작업에 대해 Facade 패턴으로 간주할 수 있다.
  - Singelton : Facade는 Singleton 패턴으로 만들어지는 경우가 있다. (유틸성)
  - Mediator : Facade 패턴은 높은 레벨인 인터페이스(API)를 만든다. Mediator 패턴에서 Mediator 역할은 Colleague 역할의 중개자로서 주고 받는 역할을 한다. Facade는 단방향이지만, Mediator 패턴은 쌍방향이다.

![b05180_01](https://user-images.githubusercontent.com/7076334/47022377-51a80480-d198-11e8-9684-625a37477470.png)

## Mediator (중개인을 통해서 처리하기)
- 동료들은 모두 중개인에게만 보고 하고, 중개인만 동료들에게 지시를 내릴 수 있다.
- 다수의 오브젝트(객체) 사이를 조정해야 할 경우 Mediator 패턴을 이용한다. (채팅)
- GUI 어플리케이션에서 효과적이다.
- Mediator 사용하면 사용하면 어떤 이점이 있을까?
  - 한곳에서 관리하기 때문에 효율적으로 자원관리를 할 수 있다.
  - 객체간 직접적인 참조가 불필해지기 때문에 결합도가 낮다. (ConcreteColleague의 재사용성이 높아진다.)
- ConcreteColleague 역할은 재이용하기 쉽지만 ConcreteMediator 역할은 재이용하기 어렵다. (어플리케이션의 의존도가 높다는 것은 재이용성이 낮다는 것이다.)
- 반면 객체간의 로직이 복잡해지거나 형태가 자주 변경되는 경우 유지보수, 관리가 점점 어려워진다.
- 관련 패턴
  - Facade : Mediator 패턴에는 Mediator는 Colleague 역할의 중개자로써 주고받기를 수행한다. (쌍방향). Facade 패턴에서는 일방적으로 다른 역할을 이용해서 높은 레벨의 인터페이스(API)를 만들었다. (단방향)
  - Observer : Mediator 역할과 Colleague 역할의 통신은 Observer 패턴을 사용해서 실행되는 경우가 있다.

![mediator](https://user-images.githubusercontent.com/7076334/47061801-18aa7700-d20e-11e8-8373-e0be258f7a27.gif)

## Observer (상태의 변화를 알려주기)
- Observer 패턴에서는 관찰 대상의 상태가 변화하면 관찰자에게 알려준다.
- 추상 클래스나 인터페이스를 사용해서 구상 클래스로부터 추상 메소드를 분리한다.
- 인수로 인스턴스를 전달할 때, 구상 클래스의 형태로 하지 않고 추상 클래스나 인터페이스의 형태로 해 둔다.
- 일반적으로 ConcreteObserver 역할의 클래스를 설계할 경우 update 메소드가 호출되는 순서가 변해도 문제가 일어나지 않도록 해야한다.
- Observer는 '관찰자'라는 의미이지만 실제로 Observer는 능동적으로 '관찰' 하는 것이 아니고, Subject 역할로부터 '전달'되는 것을 수동적으로 기다리고 있다. (Publish-Subscribe 발행/구독 패턴이라고도 한다.)
- Observer 사용하면 사용하면 어떤 이점이 있을까?
  - Subject 클래스와 Observer 클래스가 서로 독립적으로 변경될 수 있어서, 각각 재사용할 수 있다.
- java.util.Observer와 무엇이 다를까?
  - java.util.Observer 인터페이스는 public void update(Observable obj, Object arg)를 지원한다. 
  - Subject 역할을 하는 Observable(class)를 사용해야 되는데 단일 상속이기 때문에 Subject 역할을 하는 클래스가 이미 다른 클래스의 하위 클래스 일 경우 Observable로 사용할 수 없다.
- 관련 패턴
  - Mediator : Mediator 역할과 Colleague 역할의 통신에 Observer 패턴을 사용하는 경우가 있다.
    - Mediator 패턴에서도 상태변화를 알리지만, 그것은 Colleague 역할의 조정이라는 목적으로 동작하고 있는 일부에 지나지 않는다.
    - Observer 패턴에서는 Subject 역할의 상태변화를 Observer 역할에게 알리는 일, 알려서 동기화를 이루는 일에 주안점을 두고 있다.
    
![500px-observer_w_update svg](https://user-images.githubusercontent.com/7076334/47081945-11538f80-d247-11e8-85af-cc3bf689549c.png)


## Memento (상태를 저장하기)
- Memento 사용하면 사용하면 어떤 이점이 있을까?
  - undo(실행취소)
  - redo(재 실행)
  - history(작업 이력의 작성)
  - snapshot(현재 상태의 저장)
  - 어떤 시점의 인스턴스의 상태를 확실하게 기록해서 저장해 두면 나중에 인스턴스를 그 시점의 상태로 되돌릴 수 있다.
- Memento의 역할
  - wide interface(넓은 인터페이스) : 오브젝트의 상태를 원래의 상태로 돌리기 위해 필요한 정보를 모두 얻을 수 있다. 내부 상태를 알 수 있기 때문에 Originator 에서만 사용할 수 있다.
  - narrow interface(좁은 인터페이스) : 외부의 Caretaker 역할에게 보여주는 것이다. 기능에 한계가 있기 떄문에 내부 상태가 외부에 공개되는 것을 방지한다.
- 관련 패턴
  - Command : Command 패턴을 사용해서 명령을 처리하는 경우 Memento 패턴을 사용해서 undo나 redo를 실행할 수 있다.
  - Prototype : Memento 패턴에서는 인스턴스 복원을 위해 현재의 상태를 저장한다. Prototype 패턴에서는 현재의 인스턴스와 동일한 상태의 다른 인스턴스를 만들고, 인스턴스의 내용은 전부 복사된다.
  - State : Memento 패턴에서는 인스턴스가 '상태'를 표현한다. State 패턴에서는 클래스가 '상태'를 표현한다.

![memento](https://user-images.githubusercontent.com/7076334/47085417-7f04b900-d251-11e8-8760-a9dbc205b222.gif)

## State (상태를 클래스로 표현하기)
- 상태를 클래스로 표현하면 클래스를 교체해서 '상태의 변화'를 표현할 수 있고, 새로운 상태를 추가해야 될 때 무엇을 프로그램하면 좋을지 분명해 진다.
- State 패턴에서는 '현재의 상태'에 대해서 if 문을 사용하지 않는다. (if문 대체)
- State 패턴을 사용할 경우 상태전환은 누가 관리해야 하는지 주의 해야 한다.
- State 사용하면 사용하면 어떤 이점이 있을까?
  - 상태 변환에 따른 행위 변경이 손쉽게 이루어진다.
  - 객체 내부에서 상태값을 비교하는(if) 문장을 없앨 수 있다.
  - 특정 상태와 관련된 행위들을 하나의 객체로 모아주는 역할을 한다.
- 관련 패턴
  - Singleton : ConcreteState 역할은 Singleton 패턴으로 구현되는 경우가 많다.
  - Flyweigth : 상태를 표시하는 클래스는 인스턴스를 갖지 않는다. Flyweight 패턴을 사용해서 ConcreteState 역할의 복수의 Context 역할에서 공유할 수 있는 경우가 있다.
  - Observer : Context의 상태를 넘겨줘서 State에서 Context 메소드를 호출하는 구조가 비슷하다.
  
![470px-state_design_pattern_uml_class_diagram svg](https://user-images.githubusercontent.com/7076334/47089189-32be7680-d25b-11e8-8473-9217f8944a70.png)

## Flyweight (동일한 것을 공유해서 낭비 없애기)
- 이 디자인 패턴은 오브젝트를 '가볍게' 하기 위한 것이다. (메모리를 적게 사용하는 것이다.)
- '인스턴스를 가능한 대로 공유시켜서 쓸데없이 new 하지 않도록 한다.' ex) Integer 내부에서 -128 ~ 127 까지 캐시 처리 해놓았다.
- redis나 memcached 같은 메모리 캐시랑 다른 좀은 Flyweight는 동일 객체를 불러온다.
- Flyweight 사용하면 사용하면 어떤 이점이 있을까?
  - 객체 생성을 하는 리소스와 시간을 줄일 수 있기 때문에 성능 향상
  - 많은 객체를 만들때 메모리를 줄일 수 있다. (재귀)
- 관련 패턴
  - Proxy : Flyweight 패턴에서 인스턴스의 생성에 시간이 걸리는 경우, 인스턴스의 공유에 따라서 처리 속도가 향상된다.
  - Composite : Flyweight 패턴을 사용해서 Composite 패턴의 Leaf 역할을 공유시킬 수 있는 경우가 있다.
  - Singleton : FlyweightFactory 역할은 Singleton 패턴이 되는 경우가 있다.

![flyweight](https://user-images.githubusercontent.com/7076334/47094578-6f439f80-d266-11e8-9b9f-f4226794297a.PNG)

## Proxy (필요해지면 만들기)
- 대리인이 할 수 있는 일에는 한계가 있다. 범위를 넘는 일이 발생하면, 대리인은 본인한테 와서 상담을 해야 한다.
- Proxy는 RealSubject가 필요해지면 그때 RealSubject를 생성한다.
- Proxy 사용하면 사용하면 어떤 이점이 있을까?
  - 기동 시점에 이용하지 않는 기능을 전부 초기화하면, 어플리케이션의 기동에 시간이 많이 걸린다. 그래서 사용하는 단계 때 처음으로 초기화를 시키면 속도를 올릴 수 있다. (lazy loading)
  - Proxy와 RealSubject를 분할해서 부품화를 만들면, 개별적옹르 수정 할 수 있다. (divide & conquer)
  - 지연 평가를 사용하고 싶지 않으면 Client에서 Proxy를 new 하지 않고 RealSubject를 new 하면 된다. (Subjecet interface를 공통으로 사용하기 때문에 가능)
  - HTTP Proxy를 사용하면 캐쉬해서 어떤 페이지를 대신 취득할 수 있다. 유효 시간이 지났을 때 웹 서버에서 웹 페이지를 가지러 간다.
- Proxy 종류
  - Virtual Proxy(가상 프록시) : 인스턴스가 필요한 시점에서 생성, 초기화를 실행한다.
  - Remote Proxy(원격 프록시) : RealSubject 역할이 네트워크의 상대 쪽에 있음에도 불고하고 자신의 옆에 있는 것처럼(투과적) 메소드를 호출할 수 있다. Java의 RMI가 여기에 해당한다.
  - Access Proxy : 정해진 사용자이면 메소드 호출을 허가하지만, 그외에는 에러로 처리하는 Proxy 이다.
- 관련 패턴
  - Adapter : Adapter 패턴은 인터페이스가 서로 다른 오브젝트의 사이를 이어주는 역할을 한다. Proxy 패턴의 Proxy와 RealSubject 역할도 같다.
  - Decorator : Decorator 패턴과 Proxy 패턴의 구현은 비슷하지만 목적이 다르다. Decorator 패턴의 목적은 새로운 기능 추가 이지만, Proxy의 목적은 본인의 작업을 대리인에게 위임해서 본인에 대한 엑세스를 줄이는 것이다.
    
![439px-proxy_pattern_diagram svg](https://user-images.githubusercontent.com/7076334/47128827-df394080-d2cd-11e8-9c84-b50f03a0279d.png)

## Command (명령을 클래스로 표현하기)
- 명령을 나타내는 클래스의 인스턴스로 하나의 '물건' 처럼 표현할 수 있다.
- Command 사용하면 사용하면 어떤 이점이 있을까?
  - 명령의 집합을 저장해 두면 같은 명령을 재 실행할 수도 있고, 복수의 명령을 모아서 새로운 명령으로 재이용할 수도 있다.
- 관련 패턴
  - Composite : Macro Command를 실현하기 위해 Composite 패턴이 사용되는 경우가 있다.
  - Memento : Command 역할의 이력을 저장하는 경우에 Memento 패턴이 사용되는 경우가 있다.
  - Prototype : 발생한 이벤트(작성한 명령)을 복제하는 경우에 Prototype 패턴이 사용되는 경우가 있다.
  
![command](https://user-images.githubusercontent.com/7076334/47131203-786d5480-d2d8-11e8-8c53-b1a31d9f524e.gif)


## Interpreter (문법규칙을 클래스로 표현하기)
- TerminalExpression: 문법에 정의한 터미널 기호와 관련된 해석 방법을 구현한다. (메인 해석기)
- NonterminalExpression: 기호에 대해서 클래스를 정의 한다.
- Interpreter 사용하면 사용하면 어떤 이점이 있을까?
  - 각 문법 규칙을 클래스로 표현하기 때문에 언어를 쉽게 구현할 수 있다.
  - 문법이 클래스에 의해 표현되기 때문에 언어를 쉽게 변경하거나 확장할 수 있다.
- 관련 패턴
  - Composite : NonterminalExpresion 역할은 재귀적인 구조를 갖는 경우가 많다. (재귀)
  - Flyweight : TerminalExpression 역할은 Flyweight 패턴을 사용해서 공유되는 경우가 있다.
  - Visitor : 구문 트리를 작성한 후 구문 트리의 각 노드를 순회하면서 처리를 실행할 때에는 Visitor 패턴이 사용되는 경우가 있다.
  
![interpreter_uml_class_diagram svg](https://user-images.githubusercontent.com/7076334/47134744-cd18cb80-d2e8-11e8-8e4c-a41f0e0daebe.png)

## GOF에 의한 디자인 패턴의 분류
  - 생성에 관한 패턴 : 객체의 생성에 관련 패턴
    - Abstract Factory
    - Builder
    - Factory Method
    - Prototype
    - Singleton
  - 구조에 관한 패턴 : 클래스나 객체를 조합해 더 큰 구조를 만드는 패턴
    - Adapter
    - Bridge
    - Composite
    - Decorator
    - Facade
    - Flayweight
    - Prxoy
  - 행동에 관한 패턴 : 객체나 클래스 사이의 알고히즘이나 책임 분배 관련된 패턴 (결합도 최소화)
    - Chain of Responsibility
    - Command
    - Interprter
    - Iterator
    - Mediator
    - Memento
    - Observer
    - State
    - Strategy
    - Template Method
    - Visitor

## 클래스, 객체 패턴 분류
  - 클래스 패턴 : 클래스 사이의 관계가 상속을 통해서 정의된다. (컴파일)
    - Factory Method
    - Adapter
    - Template Method
    - Interprter
  - 객체 패턴 : 객체 사이의 관계를 다루며, 보통 구성을 통해서 정의된다. (런타임)
    - Abstract Factory
    - Builder
    - Prototype
    - Singleton
    - Bridge
    - Composite
    - Decorator
    - Facade
    - Flayweight
    - Prxoy
    - Chain of Responsibility
    - Command
    - Iterator
    - Mediator
    - Memento
    - Observer
    - State
    - Strategy
    - Visitor
    
