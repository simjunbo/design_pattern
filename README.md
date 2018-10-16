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
  - '기능의 클래스 계층'과 '구현의 클래스 계층'을 분리해두면 각각의 클래스 계층을 독립적응로 확장할 수 있다.
  - 기능을 추가하고 싶으면 기능의 클래스 계층에 클래스를 추가한다. 이때 구현의 클래스 계층은 전혀 수정할 필요가 없다.
- 관련 패턴
  - Template Method : Template Method 패턴에서는 구현의 클래스 계층을 이용한다. 상위 클래스에서는 추상 메소드를 사용해서 프로그래밍을 실행하고 하위 클래스에서는 그 추상 메소드를 구현하낟.
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
- 관련 패턴
  - Command : Command 패턴에서 '매크로 커맨드'를 만들 때 Composite 패턴이 사용
  - Visitor : Visitor 패턴은 Composite를 순환하면서 처리하는데 사용
  - Decorator : Composite 패턴은 Composite, Leaf을 Component 역할로 동일시 한다. Decorator 패턴은 장식과 내용물을 동일시한다.
  
![480px-composite_uml_class_diagram_ fixed svg](https://user-images.githubusercontent.com/7076334/46953214-37065a80-d0c8-11e8-8f78-f95c58fcc3f7.png)

## Decorator (장식과 내용물을 동일시하기)
- Decorator 패턴과 Composite 패턴은 재귀적인 구조를 취하는 저멩서 유사하지만 목적이 다르다.
  - Decorator 패턴은 테두리 장식을 중복해서 기능을 추가해가는 것에 주안점을 두기 때문이다.
- Decorator 사용하면 사용하면 어떤 이점이 있을까?
  - 내용물을 바꾸지 않고 기능을 추가할 수 있다.
  - 동적인 기능을 추가할 수 있다. (위임을 통한 느슨한 결합)
  - 단순한 장식이라도 다양한 기능을 추가할 수 있다. (ex 토핑)
  - 사용 되는곳 (java.io 패키지의 FileReader, BufferedReader 등)
- 반면 단점으로 유사한 설질의 작은 클래스가 많이 만들어지는 결점이 있다.
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
  - ConcreteVisitor 역할을 추가하는 것은 간단하다. 처리를 위한 ConcreteElement 역할을 수정할 필요는 없기 때문이다.
  - ConcreteElement 역할의 추가는 곤란하다. 새로운 ConcreteElement가 추가된다면 ConcreteVisitor에 새로운 visit 메소드를 구현해야 된다.
- Visitor(처리), Element(구조)
- 관련 패턴
  - Iterator : Iterator와 Visitor 패턴 모두 어떤 데이터 구조 상에서 처리를 실행한다. Iterator는 데이터 구조가 지니고 있는 요소를 하나씩 얻는데 사용하지만, Visitor는 데이터 구조가 지니고 있는 요소에 특정한 처리를 실행하는데 사용
  - Composite : 방문처가 되는 데이터 구조는 Composite 패턴이 되는 경우가 많다. (재귀)
  - Interpreter : Interpreter 패턴에서 visitor 패턴이 사용되는 경우가 있다.

![200f0e3b512e09dd20](https://user-images.githubusercontent.com/7076334/47012601-82c80b00-d17f-11e8-8a64-e232ba224389.png)

## Chain of Responsibility (책임 떠넘기기)
- 어떤 요청이 발생했을 때 그 요청을 처리할 오브젝트를 직접 결정할 수 없는 경우, 복수의 오브젝트(객체)를 사슬(chain) 처럼 연결해 두면, 그 오브젝트(객체)의 사슬을 차례로 돌아다니면서 목적한 오브젝트(객체)를 결정하는 방법.
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


