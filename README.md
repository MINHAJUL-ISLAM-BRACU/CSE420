# CSE420
Only Contain Labs
Lab 1: Activity List

                                            Task 1: For the following sample program find all the tokens. 
                                                   Note that a lexical Analyzer is responsible for 
    1. Scan Input
    2. Remove WS, NL, ...
    3. Identify Tokens
    4. Create Symbol Table (ST)
    5. Insert Tokens into ST
    6. Generate Errors
    7. Send Tokens to Parser

Fig 1: Lexical Analyzer



Input:
int a, b, c;
float d, e;
a = b = 5;
c = 6;
if ( a > b)
{
        	c = a - b;
        	e = d - 2.0;
}
else
{
        	d = e + 6.0;
        	b = a + c;
}



Output:
Keywords: int, float, if, else
Identifiers: a, b, c, d, e
Math Operators: +, -, =
Logical Operators: >
Numerical Values: 5, 6, 2.0, 6.0
Others: , ; ( ) { }



