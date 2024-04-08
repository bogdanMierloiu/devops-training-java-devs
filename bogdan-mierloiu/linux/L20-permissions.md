`-` - normal, regular file
`d` - directory 
`l` - soft (symbolic) link 
`b` - block special file (like hard drive) 
`c` - character special file (like /dev/null) 
`n` - network file p - FIFO
`s` - socket



`r` - means Read permission is granted
`w` - means Write permission is granted
`x` - means eXecute permission is granted



Digit	Meaning
0	    no access
1	    eXecute
2	    Write
3	    Write + eXecute
4	    Read
5	    Read + eXecute
6	    Read + Write
7	    Read + Write + eXecute


Operator	Meaning
`=`       	Set the whole block and override the previous permissions
`-`	        Remove the permission for specific user
`+`	        Add the permission for specific user


`u`	Owner
`g`	Group
`o`	Other
`a`	all (owner, group and others)