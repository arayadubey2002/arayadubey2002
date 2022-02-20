class Student:
    def __init__(self):
        self.__student_id = None
        self.__age = None
        self.__marks = None

    def set_student_id(self,student_id):
        self.__student_id=student_id
        
    def set_age(self,age):
        self.__age=age

    def set_marks(self,marks):
        self.__marks=marks

    def get_student_id(self):
        return self.__student_id

    def get_age(self):
        return self.__age

    def get_marks(self):
        return self.__marks
    
    def validate_marks(self):
        if self.__marks>=0 and self.__marks<=100:
            return True
        else:
            return False
    def validate_age(self):
        if self.__age>20:
            return True
        else:
            return False

    def check_qualification(self):
        x=self.validate_marks()
        y=self.validate_age()
        
        if x==True and y==True:
            if self.__marks>=65:
                return True
            else:
                return False
         else:
            return False
            

s1=Student
s1.set_student_id(123)
s1.set_age(21)
s1.set_marks(-1)
print(s1.check_qualification())

        
