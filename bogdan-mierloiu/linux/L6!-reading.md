# The true linux admin uses vim

!!!!!!!!!!!!! `less` is more advanced than `more` !!!!!!!!!!!!!!

`vi` / `vim` -> is fully functional, very powerful text editor

`file testfile` -> will show the type of the file
`file -i testfile` -> will show the type of the file and the encoding

`cat` = concatenate


## VIM ENVIRONMENT

- press `Esc` and then `:q!` to exit without saving
- press `Esc` and then `:wq` to save and exit
- press `Esc` and then `:w` to save
- press `Esc` and then `:q` to exit


`more` -> Will display the content of the file page by page
`less` -> will display the content of the file page by page -> more advanced than `more`. You can scroll up and down, search, etc.
        `/word-search` -> search for a word in the file +`n` to go to the next occurrence
        `?word-search` -> search for a word in the file + `n` to go to the previous occurrence

`REMEMBER -> <<<<<<< LINUX IS CASE SENSITIVE >>>>>>>`

Good for reading logs, configuration files, etc. -> `cat file | more` or `cat file | less`

`head file` -> will display the first 10 lines of the file
`head -n1 file` -> will display the first line of the file
`head -n5 file` -> will display the first 5 lines of the file

`tail file` -> will display the last 10 lines of the file
`tail -n1 file` -> will display the last line of the file
...............

cat file | head -n5 -> will display the first five lines of the file