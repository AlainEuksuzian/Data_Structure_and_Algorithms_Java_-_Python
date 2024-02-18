from Progression import Progression

class AbsoluteProgression(Progression):

    def __init__(self,start):

        self.previous = 2
        self.next = 200

        super().__init__(start)
    

    def _advance(self):
        distance = abs(self.previous - self.next)
        self._current += distance
        self.previous = self.next
        self.next = distance

    def print(self):
        return "distance: " + str(self._current) + " previous: " + str(self.previous) + " next: " + str(self.next)




movement = AbsoluteProgression(0)

movement._advance()
print(movement.print())
movement._advance()
print(movement.print())
movement._advance()
print(movement.print())
