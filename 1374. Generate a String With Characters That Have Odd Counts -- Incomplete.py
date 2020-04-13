import random


class Solution:
    dictionary = {
        'a': 0,
        'b': 0,
        'c': 0,
        'd': 0,
        'e': 0,
        'f': 0,
        'g': 0,
        'h': 0,
        'i': 0,
        'j': 0,
        'k': 0,
        'l': 0,
        'm': 0,
        'n': 0,
        'o': 0,
        'p': 0,
        'q': 0,
        'r': 0,
        's': 0,
        't': 0,
        'u': 0,
        'v': 0,
        'w': 0,
        'x': 0,
        'y': 0,
        'z': 0,
    }

    alphas = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u',
              'v', 'w', 'x', 'y', 'z'];
    result = list()
    str = "";

    def new_try(self, n):
        if n == 0:
            self.str = ''.join(self.result)
        elif n == 1:
            self.str = 'a'
        else:
            if n % 2 == 0:
                first_char_repeat_time = n - 1
                second_char_repeat_time = 1
                print(first_char_repeat_time)
                print(second_char_repeat_time)

                self.result = ['a'] * first_char_repeat_time
                self.result = self.result + ['b'] * second_char_repeat_time
                print(self.result)
                self.str = ''.join(self.result)
            else:
                self.result = ['a'] * n
                self.str = ''.join(self.result)

        return self.str

    def generateTheString(self, n):
        for i in range(n):
            self.result().append(random.randrange(0, 26, 1))

    def validateString(self):
        return False;

        return True;

    numbs = list()

    def randomNumberGenerator(self, n):

        quoteint = n // 3
        self.numbs.append(quoteint)
        self.numbs.append(quoteint - 1)
        self.numbs.append(quoteint + 1)
        print(self.numbs)

        sum_of_even_numbers = 0;
        for i in range(len(self.numbs)):
            if self.numbs[i] % 2:
                sum_of_even_numbers

        i = 0
        while sum(self.numbs) != n:
            # print(i)
            number = self.numbs[i]
            if (number % 2 == 0):
                self.numbs[i] = (number / 2) + 1
                self.numbs.insert(i, (number / 2) - 1)
            i = i + 1
            print(self.numbs)
            if (i == len(self.numbs) - 1):
                difference = n - sum(self.numbs)
                self.numbs.append(difference)
                i = 0

        # for i in range(len(self.numbs)) :
        #     if self.numbs[i]%2 == 2 :
        #         self.numbs[i] += 1        # making even number odd

        print(self.numbs)
        print(sum(self.numbs))


s = Solution()
print(s.new_try(4))
