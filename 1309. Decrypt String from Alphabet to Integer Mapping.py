class Solution:
    # Dictionary that maintains the encoding of each numeric sequence
    encoding = {
        '1': 'a',
        '2': 'b',
        '3': 'c',
        '4': 'd',
        '5': 'e',
        '6': 'f',
        '7': 'g',
        '8': 'h',
        '9': 'i',
        '10#': 'j',
        '11#': 'k',
        '12#': 'l',
        '13#': 'm',
        '14#': 'n',
        '15#': 'o',
        '16#': 'p',
        '17#': 'q',
        '18#': 'r',
        '19#': 's',
        '20#': 't',
        '21#': 'u',
        '22#': 'v',
        '23#': 'w',
        '24#': 'x',
        '25#': 'y',
        '26#': 'z'
    }

    def freqAlphabets(self, s: str) -> str:
        input_list = list(s);
        result = list();

        # First decode all the chars with #
        while input_list.count("#") > 0:
            first_occurance = input_list.index("#")
            decoded_letter = self.encoding[''.join(input_list[first_occurance - 2:first_occurance + 1])]
            # Remove the digits against that
            input_list.pop(first_occurance - 2)
            input_list.pop(first_occurance - 2)
            input_list[first_occurance - 2] = decoded_letter

        # Then decode all the remaining characters
        for i in range(len(input_list)) :
            if input_list[i].isnumeric() :
                input_list[i] = self.encoding[input_list[i]]

        return ''.join(input_list)


s = Solution()
s.freqAlphabets("")
