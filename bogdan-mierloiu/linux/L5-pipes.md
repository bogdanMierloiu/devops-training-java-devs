# The pipes and redirections are used to send (or retrieve) some information sent from one command or script to another command or script. It works on files too.

`|` is a pipe. It is used to send the output of one command to another command.

`grep`  This command search for a given pattern in the output. Output may be the file or output from another command.

`grep 'case' .bashrc` This command will search for pattern `case` in a file `.bashrc`

`wc` is a utility for counting words, newlines, bytes. Commonly we use it for counting lines.

When we execute : `wc -l .bashrc` -> it will count how many lines (`-l` argument) are in our `.bashrc` file.

sort will sort the output in alphabetical order

`sort numbers.txt` will sort the prepared file with generated numbers.

By using `uniq` we can limit the occurrences of the same record to only one. But to have this done properly, sort is needed; therefore, we need to pipe these to another.


command1 | command2

command1 | command2 | command3 -> `we can chain multiple commands`

## `cat numbers.txt` -> will display the content of the file

`cat numbers.txt | uniq | wc -l` -> will count how many unique numbers are in the file
`cat numbers.txt | sort | uniq | wc -l` -> will count how many unique numbers are in the file

Just with `uniq` we will not get the correct result because it will eliminate only the consecutive lines duplicates. 
If we have the same number on different lines, it will not be considered a duplicate, but with `sort` first we will sort the numbers, and then we will eliminate the duplicates.


`wc -l numbers.txt` -> will count how many lines are in the file

ls -al > list.txt -> will save the output of the `ls -al` command to a file named `list.txt`
`ls -al` - list files from directory with details
`>` - redirect the output to a file
`directorylist.txt` file where the redirected output will be sent.


the `>` redirection will do as follows:

- If the file doesn't exist, create it
- Add content from redirected output
- If the file exists, and it is not empty, `clear` the file `and write` the redirected output in empty file

the `>>` redirection will do as follows:

- If the file doesn't exist, create it
- Add content from redirected output
- If the file exists, and it is not empty, `append` the redirected output to the existing content

