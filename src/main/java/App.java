import abstractfactory.AbstractFac;
import activeobject.ActiveObject;
import adapter.Adapter;
import balking.Balking;
import bindingproperties.BindingProperties;
import bridge.Bridge;
import builder.Builder;
import callback.Callback;
import chainofresponsibility.ChainOfResponsibility;
import command.Command;
import composite.Composite;
import compositeentity.CompositeEntity;
import dataaccessobject.DataAccessObject;
import decorator.Decorator;
import delegation.Delegation;
import dependencyinjection.DependencyInjection;
import dirtyflag.DirtyFlag;
import dto.Dto;
import eventqueue.EventQueue;
import facade.Facade;
import factorymethod.FactoryMethod;
import featuretoggle.FeatureTog;
import filter.Filter;
import flyweight.Flyweight;
import frontcontroller.FrontCtrl;
import futurepromise.FuturePromise;
import immutable.Immutable;
import interpreter.Interpreter;
import iterator.Iter;
import lazyloading.LazyLoading;
import mediator.Mediator;
import memento.Memento;
import monostate.MonoState;
import multiton.Multiton;
import nullObject.NullObject;
import objectmother.ObjectMother;
import pipeline.Pipeli;
import prototype.Prototype;
import proxy.Proxy;
import publishsubscribe.PublishSubscribe;
import readerwriterlock.ReaderWriterLock;
import singleton.Singleton;
import specification.Specific;
import state.State;
import strategy.Strategy;
import templatemethod.TemplateMethod;
import threadpool.ThreadPool;
import throttling.Throttling;
import transferobject.TransferObject;
import visitor.Visit;

import java.lang.reflect.Field;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        System.out.println("==========奇妙厨房==========");
        System.out.println("===========================");
        System.out.println("    1. Abstract Factory    ");
        System.out.println("    2. Active Object       ");
        System.out.println("    3. Adapter             ");
        System.out.println("    4. Balking             ");
        System.out.println("    5. Binding Properties  ");
        System.out.println("    6. Bridge              ");
        System.out.println("    7. Builder             ");
        System.out.println("    8. Callback            ");
        System.out.println("    9. Chain Of Responsibility");
        System.out.println("    10. Command            ");
        System.out.println("    11. Composite          ");
        System.out.println("    12. Composite Entity   ");
        System.out.println("    13. Data Access Object ");
        System.out.println("    14. Decorator          ");
        System.out.println("    15. Delegation         ");
        System.out.println("    16. Dependency Injection");
        System.out.println("    17. Dirty Flag         ");
        System.out.println("    18. Dto                ");
        System.out.println("    19. Event Queue        ");
        System.out.println("    20. Facade             ");
        System.out.println("    21. Factory Method     ");
        System.out.println("    22. Feature Toggle     ");
        System.out.println("    23. Filter             ");
        System.out.println("    24. Flyweight          ");
        System.out.println("    25. Front Controller   ");
        System.out.println("    26. Future/Promise     ");
        System.out.println("    27. Immutable          ");
        System.out.println("    28. Interpreter        ");
        System.out.println("    29. Iterator           ");
        System.out.println("    30. Lazy Loading       ");
        System.out.println("    31. Mediator           ");
        System.out.println("    32. Memento            ");
        System.out.println("    33. MonoState          ");
        System.out.println("    34. Multiton           ");
        System.out.println("    35. NullObject         ");
        System.out.println("    36. Object Mother      ");
        System.out.println("    37. Pipeline           ");
        System.out.println("    38. Prototype          ");
        System.out.println("    39. Proxy              ");
        System.out.println("    40. Publish Subscriber ");
        System.out.println("    41. Reader Writer Lock ");
        System.out.println("    42. Singleton          ");
        System.out.println("    43. Specification      ");
        System.out.println("    44. State              ");
        System.out.println("    45. Strategy           ");
        System.out.println("    46. Template Method    ");
        System.out.println("    47. Thread Pool        ");
        System.out.println("    48. Throttling         ");
        System.out.println("    49. Transfer Object    ");
        System.out.println("    50. Visitor            ");

        System.out.println("===========================");
        Scanner scanner = new Scanner(System.in);
        a: while (true) {
            int option = scanner.nextInt();
            switch (option) {
                case 0:
                    break a;
                case 1:
                    AbstractFac.test();
                    break;
                case 2:
                    ActiveObject.test();
                    break;
                case 3:
                    Adapter.test();
                    break;
                case 4:
                    Balking.test();
                    break;
                case 5:
                    BindingProperties.test();
                    break;
                case 6:
                    Bridge.test();
                    break;
                case 7:
                    Builder.test();
                    break;
                case 8:
                    Callback.test();
                    break;
                case 9:
                    ChainOfResponsibility.test();
                    break;
                case 10:
                    Command.test();
                    break;
                case 11:
                    Composite.test();
                    break;
                case 12:
                    CompositeEntity.test();
                    break;
                case 13:
                    DataAccessObject.test();
                    break;
                case 14:
                    new Decorator().test();
                    break;
                case 15:
                    Delegation.test();
                    break;
                case 16:
                    DependencyInjection.test();
                    break;
                case 17:
                    new DirtyFlag().test();
                    break;
                case 18:
                    Dto.test();
                    break;
                case 19:
                    EventQueue.test();
                    break;
                case 20:
                    Facade.test();
                    break;
                case 21:
                    FactoryMethod.test();
                    break;
                case 22:
                    FeatureTog.test();
                    break;
                case 23:
                    new Filter().test();
                    break;
                case 24:
                    new Flyweight().test();
                    break;
                case 25:
                    FrontCtrl.test();
                    break;
                case 26:
                    FuturePromise.test();
                    break;
                case 27:
                    Immutable.test();
                    break;
                case 28:
                    new Interpreter().test();
                    break;
                case 29:
                    new Iter().test();
                    break;
                case 30:
                    LazyLoading.test();
                    break;
                case 31:
                    Mediator.test();
                    break;
                case 32:
                    Memento.test();
                    break;
                case 33:
                    MonoState.test();
                    break;
                case 34:
                    Multiton.test();
                    break;
                case 35:
                    NullObject.test();
                    break;
                case 36:
                    new ObjectMother().test();
                    break;
                case 37:
                    Pipeli.test();
                    break;
                case 38:
                    Prototype.test();
                    break;
                case 39:
                    Proxy.test();
                    break;
                case 40:
                    PublishSubscribe.test();
                    break;
                case 41:
                    ReaderWriterLock.test();
                    break;
                case 42:
                    Singleton.test();
                    break;
                case 43:
                    Specific.test();
                    break;
                case 44:
                    State.test();
                    break;
                case 45:
                    Strategy.test();
                    break;
                case 46:
                    new TemplateMethod().test();
                    break;
                case 47:
                    ThreadPool.test();
                    break;
                case 48:
                    new Throttling().test();
                    break;
                case 49:
                    TransferObject.test();
                    break;
                case 50:
                    Visit.test();
                    break;
            }
            System.out.println("===========================");
        }
        System.out.println("Bye~~~~");
        System.exit(1);

    }
}
