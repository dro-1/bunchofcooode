
def caesar_cipher(word,shift):
    result = ""
    for letter in word:
        if letter != " ":
            print(letter)
            x = ord(letter)
            print(x)
            if x != 90 or x!= 122:
                x+=shift
                y = chr(x)
                result = result+y
                print(result) 
            else:
                if x == 90:
                    x = 65
                    temp = shift - 1
                    x+=temp
                    y = chr(x)
                    result = result+y
                    print(result)
                if x == 122:
                    x = 97
                    temp = shift - 1
                    x+=temp
                    y = chr(x)
                    result = result+y
                    print(result)
        else:
            result = result + " "
            print(result)
       
        
caesar_cipher("abc def ghijjj",3)
   