class Solution {
    public String largestOddNumber(String num) {
        for(int i=num.length()-1; i>=0; i--){
            int digit = num.charAt(i)-'0';
            if(digit%2==1){
                return num.substring(0,i+1);
            }
        }
        return "";   
    }
}

/*
what "52" actually is 
String num = "52";
"52" is ONE STRING OBJECT,
but internally it is stored as sequence of character.
String "52"
┌─────┬─────┐
│ '5' │ '2' │
└─────┴─────┘
 index 0   index 1
So Java automatically splits a String into characters internally.

String num = "52";
int i = 1;
int digit = num.charAt(i) - '0';

num.charAt(1) = '2'
'2' ASCII = 50
'0' ASCII = 48

digit = 50 - 48
digit = 2

Character :  '2'
ASCII     :  50
             -
Character :  '0'
ASCII     :  48
----------------
Integer   :   2
*/

