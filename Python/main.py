class Person:
    def __init__(self, Name, Pay):
        self.Name = Name
        self.Pay = Pay
        self.hours = []
        
    def addHours(self,timeIn, timeOut):
        hourSet = [timeIn, timeOut]
        self.hours.append(hourSet)
        
        
