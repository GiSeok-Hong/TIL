def hello(func) :
    print('Hello, it\'s me')
    func()
    print('oh, no')


@hello
def bye() :
    print('Good Bye')

bye()