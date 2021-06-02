#from datetime import date
#from datetime import time
import datetime

DEBUG = True

class Person:
    
    def __init__(self, Name):
        self.Name = Name
        self.PayRate = 7.25
        self.ClockedInOut = []
        self.hoursWorked = []
        
    #used to calculate total hours worked, doesn't work currently
    def calcHoursWorked(self):
        calculated = 0
        datetimeFormat = '%Y-%m-%d %H:%M'
        
        for i in self.ClockedInOut:
            
            print(i[0])
            print(i[1])
            
            print((datetime.datetime.strptime(i[0], datetimeFormat) - datetime.datetime.strptime(i[1], datetimeFormat)))
            
            calculated = calculated + (datetime.datetime.strptime(i[0], datetimeFormat) - datetime.datetime.strptime(i[1], datetimeFormat))
        
        self.hoursWorked.append(calculated)
    
    
    def addClockedInOut(self,timeIn, timeOut):#used to add ClockedInOut
        self.ClockedInOut.append([timeIn, timeOut])
    
        
    def changePayRate(self, newRate):#used to change pay rate
        self.PayRate = newRate 
    
        
    def __str__(self):#Returns a string rep of the person
        self.calcHoursWorked()
        
        return("Name {} \n\tPay: {} \n\tClockedInOut: {} \n\tHoursWorked: {}".format(self.Name, self.PayRate, self.ClockedInOut, self.hoursWorked))
    
    
    



if(DEBUG):
    P1 = Person("John")
    P1.changePayRate(10)

    P1.addClockedInOut("2021-2-12 4:00","2021-2-12 13:00")

    P2 = Person("Jack")
    P2.changePayRate(7.25)
    P2.addClockedInOut("2021-2-12 13:00","2021-3-12 4:00")

    print(P1)
    print(P2)