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
import dataaccessobject.DataAccessObject;
import decorator.Decorator;
import delegation.Delegation;
import dependencyinjection.DependencyInjection;
import dirtyflag.DirtyFlag;
import dto.Dto;
import eventqueue.EventQueue;
import featuretoggle.FeatureTog;
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
import templatemethod.TemplateMethod;
import threadpool.ThreadPool;
import throttling.Throttling;
import transferobject.TransferObject;
import visitor.Visit;

import java.util.Scanner;

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
        System.out.println("    12. Data Access Object ");
        System.out.println("    13. Decorator          ");
        System.out.println("    14. Delegation         ");
        System.out.println("    15. Dependency Injection");
        System.out.println("    16. Dirty Flag         ");
        System.out.println("    17. Dto                ");
        System.out.println("    18. Event Queue        ");
        System.out.println("    19. Feature Toggle     ");
        System.out.println("    20. Flyweight          ");
        System.out.println("    21. Front Controller   ");
        System.out.println("    22. Future/Promise     ");
        System.out.println("    23. Immutable          ");
        System.out.println("    24. Interpreter        ");
        System.out.println("    25. Iterator           ");
        System.out.println("    26. Lazy Loading       ");
        System.out.println("    27. Mediator           ");
        System.out.println("    28. Memento            ");
        System.out.println("    29. MonoState          ");
        System.out.println("    30. Multiton           ");
        System.out.println("    31. NullObject         ");
        System.out.println("    32. Object Mother      ");
        System.out.println("    33. Pipeline           ");
        System.out.println("    34. Prototype          ");
        System.out.println("    35. Proxy              ");
        System.out.println("    36. Publish Subscriber ");
        System.out.println("    37. Reader Writer Lock ");
        System.out.println("    38. Singleton          ");
        System.out.println("    39. Specification      ");
        System.out.println("    40. State              ");
        System.out.println("    41. Template Method    ");
        System.out.println("    42. Thread Pool        ");
        System.out.println("    43. Throttling         ");
        System.out.println("    44. Transfer Object    ");
        System.out.println("    45. Visitor            ");

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
                    DataAccessObject.test();
                    break;
                case 13:
                    new Decorator().test();
                    break;
                case 14:
                    Delegation.test();
                    break;
                case 15:
                    DependencyInjection.test();
                    break;
                case 16:
                    new DirtyFlag().test();
                    break;
                case 17:
                    Dto.test();
                    break;
                case 18:
                    EventQueue.test();
                    break;
                case 19:
                    FeatureTog.test();
                    break;
                case 20:
                    new Flyweight().test();
                    break;
                case 21:
                    FrontCtrl.test();
                    break;
                case 22:
                    FuturePromise.test();
                    break;
                case 23:
                    Immutable.test();
                    break;
                case 24:
                    new Interpreter().test();
                    break;
                case 25:
                    new Iter().test();
                    break;
                case 26:
                    LazyLoading.test();
                    break;
                case 27:
                    Mediator.test();
                    break;
                case 28:
                    Memento.test();
                    break;
                case 29:
                    MonoState.test();
                    break;
                case 30:
                    Multiton.test();
                    break;
                case 31:
                    NullObject.test();
                    break;
                case 32:
                    new ObjectMother().test();
                    break;
                case 33:
                    Pipeli.test();
                    break;
                case 34:
                    Prototype.test();
                    break;
                case 35:
                    Proxy.test();
                    break;
                case 36:
                    PublishSubscribe.test();
                    break;
                case 37:
                    ReaderWriterLock.test();
                    break;
                case 38:
                    Singleton.test();
                    break;
                case 39:
                    Specific.test();
                    break;
                case 40:
                    State.test();
                    break;
                case 41:
                    new TemplateMethod().test();
                    break;
                case 42:
                    ThreadPool.test();
                    break;
                case 43:
                    new Throttling().test();
                    break;
                case 44:
                    TransferObject.test();
                    break;
                case 45:
                    Visit.test();
                    break;
            }
            System.out.println("===========================");
        }

    }
}
