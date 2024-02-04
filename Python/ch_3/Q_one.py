
#Write a Java method that repeatedly selects and removes a random entry from an
#array until the array holds no more entries.

import random as rand

def main():

    my_list = [10,20,30,40,50,60,70,80,90,100]

    while(len(my_list)> 0 ):
        index = rand.randint(0,len(my_list)-1)
        my_list.pop(index)
        print(my_list)


main()