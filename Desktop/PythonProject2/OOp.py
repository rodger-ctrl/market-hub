class employee:
    def __init__(self,fullname,position, status, age):
        self.fullname = fullname
        self.position = position
        self.status = status
        self.age = age

    def work(self):
        print(self.fullname, "is working")
