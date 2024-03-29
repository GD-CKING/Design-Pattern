## 简介
&emsp;&emsp;树形结构在软件中随处可见，组合模式通过一种巧妙的设计方案使得用户可以一致性地处理整个树形结构或者树形结构的一部分，也可以一致性地处理树形结构中的叶子节点（不包含子节点的节点）和容器节点。
## 组合模式定义
&emsp;&emsp;组合多个对象形成树形结构以表示具有“整体--部分”关系的层次结构。组合模式对单个对象（即叶子对象）和组合对象（即容器对象）的使用具有一致性，组合模式又可以称为“整体--部分”模式，它是一种对象结构型模式。
## 组合模式结构图

<div align=center> <img src="image/composite-pattern.png">
</div>

**（1）Component（抽象构件）**：它可以是接口或者抽象类，为叶子构件和容器构件对象声明接口，在改角色中可以包含所有子类共有行为的声明和实现。在抽象构件中定义了访问及管理它的子构件的方法，例如增加子构件、删除子构件、获取子构件等。
**（2）Leaf（叶子构件）**：它在组合模式结构中表示叶子节点对象。叶子节点没有子节点，它实现了在抽象构件中定义的行为。对于那些访问及管理子构件的方法，可以通过捕获异常等方式进行处理。
**（3）Composite（容器构件）**：它在组合模式中表示容器节点对象。容器节点包含子节点，其子节点可以是叶子节点，也可以是容器节点，它提供一个集合用于存储子节点，实现了在抽象构件中定义的行为，包括哪些方位即管理子构件的方法，在其业务方法中可以递归调用子节点的业务方法。
## 组合模式主要优缺点  

### 主要优点  
（1）组合模式可以清楚地定义分层次的复杂对象，表示对象的全部或部分层次，它让客户忽略了层次的差异，方便对整个层次结构进行控制。
（2）客户端可以一致地使用一个组合结构对其中单个对象，不必关系处理的是单个对象还是整个组合结构，简化了客户端代码。
（3）在组合模式中增加新的容器构件和叶子构件都很方便，无须对现有类库进行任何修改，符合开闭原则。
（4）组合模式为树形结构的面向对象实现提供了一种灵活的解决方案，通过叶子对象和容器对象的递归组合，可以形成复杂的树形结构，但对树形结构的控制却非常简单。
### 主要缺点  
&emsp;&emsp;组合模式的主要缺点是：在增加新的构件时很难对容器中的构件类型进行限制。有时候希望一个容器中只能有某些特定类型的对象，例如在某个文件夹中只能包含文本文件，使用组合模式时，不能依赖类型系统来施加这些约束，因为它们都来自于相同的抽象层，在这种情况下，必须通过在运行时进行类型检查来实现，这个实现过程较为复杂。
## 组合模式适用场景  
（1）在具有整体和部分的层次结构中，希望通过一种方式忽略整体与部分的差异，客户端可以一致性地对待它们。
（2）在一个使用面向对象语言开发的系统中需要处理一个树形结构。
（3）在一个系统中能够分离出叶子对象和容器对象，而且它们的类型不固定，需要增加一些新的类型。
## 安全组合模式与透明组合模式
### 透明组合模式
&emsp;&emsp;透明组合模式中，抽象构件Component中声明了所有用于管理成员对象的方法，包括add()、remove()以及getChild()等方法，这样做的好处是确保所有的构件类都有相同的接口。在客户端看来，叶子对象与容器对象所提供的方法是一致的，客户端可以相同地对待所有的对象。 
<div align=center> <img src="image/transparent-composite-pattern.png"></div>
&emsp;&emsp;透明组合模式的缺点是不够安全，因为叶子对象和容器对象本质上是有区别的。叶子对象不可能有下一个层次的对象，即不可能包含成员对象，因此为其提供add()、remove()以及getChild()等方法是没有意义的，这在编译阶段不会出错，但在运行阶段如果调用这些方法可能会出错（如果没有提供相应的错误处理代码）。 

### 安全组合模式
&emsp;&emsp;安全组合模式中，在抽象构件Component中没有声明任何用于管理成员对象的方法，而是在Composite类中声明并实现这些方法。这种做法是安全的，因为根本不向叶子对象提供这些管理成员对象的方法，对于叶子对象，客户端不可能调用到这些方法。
<div align=center> <img src="image/safe-composite-pattern.png"></div>
&emsp;&emsp;安全组合模式的缺点是不够透明，因为叶子构件和容器构件具有不同的方法，且容器构件中那些用于管理成员对象的方法没有在抽象构件类中定义，因此客户端不能完全针对抽象编程，必须有区别地对待叶子构件和容器构件。

## 案例
&emsp;&emsp;Sunny软件公司欲开发一个杀毒软件，改软件既可以对某个文件夹杀毒，也可以对某个指定的文件进行杀毒，改杀毒软件还可以根据各类文件的特定，为不同类型的文件提供不同的杀毒方式，例如图像文件和文本文件的杀毒方式就有所差异。现需要提供该杀毒软件的整体框架设计方案。

<div align=center>
<img src="image/settle.png">
</div>

```
相关实现代码已上传
