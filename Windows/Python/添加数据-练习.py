Python 3.6.5 (v3.6.5:f59c0932b4, Mar 28 2018, 17:00:18) [MSC v.1900 64 bit (AMD64)] on win32
Type "copyright", "credits" or "license()" for more information.
>>> movies=["The Holy Grail","The Life of Brain","The Meaning of Life"]
>>> movies.insert(1,1975)
>>> print(movies)
['The Holy Grail', 1975, 'The Life of Brain', 'The Meaning of Life']
>>> movies.insert(3.1979)
Traceback (most recent call last):
  File "<pyshell#3>", line 1, in <module>
    movies.insert(3.1979)
TypeError: insert() takes exactly 2 arguments (1 given)
>>> movies.insert(3,1979)
>>> print(movies)
['The Holy Grail', 1975, 'The Life of Brain', 1979, 'The Meaning of Life']
>>> movies.pop(1983)
Traceback (most recent call last):
  File "<pyshell#6>", line 1, in <module>
    movies.pop(1983)
IndexError: pop index out of range
>>> movies.append(1983)
>>> print(movies)
['The Holy Grail', 1975, 'The Life of Brain', 1979, 'The Meaning of Life', 1983]
>>> Geek_Name=["STR",233]
>>> print(Geek_Name[0])
STR
>>> print(Geek_Nmae[1])
Traceback (most recent call last):
  File "<pyshell#11>", line 1, in <module>
    print(Geek_Nmae[1])
NameError: name 'Geek_Nmae' is not defined
>>> Geek_Name=["STR","233"]
>>> print(Geek_Nmae(1))
Traceback (most recent call last):
  File "<pyshell#13>", line 1, in <module>
    print(Geek_Nmae(1))
NameError: name 'Geek_Nmae' is not defined
>>> print(Geek_Nmae[1])
Traceback (most recent call last):
  File "<pyshell#14>", line 1, in <module>
    print(Geek_Nmae[1])
NameError: name 'Geek_Nmae' is not defined
>>> print(movies)
['The Holy Grail', 1975, 'The Life of Brain', 1979, 'The Meaning of Life', 1983]
>>> print(Geek_Name)
['STR', '233']
>>> print(Geek_Name[0])
STR
>>> print(Geek_Name[1])
233
>>> movies["The Holy Grall",1975,"Terry Jone & Terry Gilliam",91,
	   ["Graham Chapman",["Michael Palin","John Chese",
			      "Terry Gilliam","Eric Idle","Terry Jones"]]]
Traceback (most recent call last):
  File "<pyshell#21>", line 3, in <module>
    "Terry Gilliam","Eric Idle","Terry Jones"]]]
TypeError: list indices must be integers or slices, not tuple
>>> movies=["The Holy Grall",1975,"Terry Jone & Terry Gilliam",91,
	   ["Graham Chapman",["Michael Palin","John Chese",
			      "Terry Gilliam","Eric Idle","Terry Jones"]]]
>>> movies=["The Holy Grall",1975,"Terry Jone & Terry Gilliam",91,
		   ["Graham Chapman",["Michael Palin","John Chese",
			      "Terry Gilliam","Eric Idle","Terry Jones"]]]
>>> print(movies)
['The Holy Grall', 1975, 'Terry Jone & Terry Gilliam', 91, ['Graham Chapman', ['Michael Palin', 'John Chese', 'Terry Gilliam', 'Eric Idle', 'Terry Jones']]]
>>> 
