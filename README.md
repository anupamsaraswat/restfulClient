# restfulClient

--------------------Test class RandomTest to UnitTest using Jmockit--------------
This class has one @test method of junit to test both the if/else path in of the tested Class method.

Using Jmockit, if you need to access a method from superclass of @mocked entity then have superclass as @mocked in the Junit test class as well.

Jmockit mocks the classes using ASM library at runTime and replcae class defintion with the modified mocked class. Once the test run is over actual class defintion replaces the mocked version again. When Jmockit mocks a class it only mocks the class and not the heirarchy, that is why when you try to access method from superClass it doesn't find mocked defintion and fail to do so.

Once you have superClass as well mocked, it it transparent to you and jmockit is able to call method from superClass.



