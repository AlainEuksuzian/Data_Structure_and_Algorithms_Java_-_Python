
#Let A be an array of size n ≥ 2 containing integers from 1 to n−1 inclusive, one
#of which is repeated. Write an algorithm for finding the integer in A that is
#repeated.


def main():
    my_list = [10,20,30,40,50,60,70,20,90,100]
    print(approach_One(my_list))
    print(approach_two(my_list))

#sorts array, loops if index i and index i+1 equal, returns true
def approach_One(my_list) :
    my_list.sort()
    for i in range(len(my_list)-1):
        if (my_list[i] == my_list[i+1]):
            return my_list[i] 
    return False


def approach_two(my_list):

    for i in range(len(my_list)):
        for k in range(i+1, len(my_list)):
            if i is not k and my_list[i] == my_list[k]:
                return my_list[i];

    return False;

main()