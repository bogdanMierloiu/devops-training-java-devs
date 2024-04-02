`tree directory_name` -> will display the structure with `hierarchy` of the directory 
`tree` -> will display the structure with `hierarchy` of the current directory

`cp -R directory_name ../target_directory` -> copy the directory to the target directory
`cp file_name ../target_directory` -> copy the file to the target directory
`cp -r directory_name ../target_directory` -> copy the directory to the target directory
`cp -r directory_name ../target_directory/new_name` -> copy the directory to the target directory with a new name


`?` this wildcard replaces one character. So, if we wish to copy all files, where the file name starts with my and ends with file,
but there is something in between, like a, g or6, but it has to be only one character (so something like `my3file`, but not myFGfile), I can use ?. It will look like this `my?file`.
`*` this wildcard replaces all characters with nay length. Considering the last example, if we wish to copy `my1file` and `myFGfile`, we will use `my*file`.


`ls -l three*` -> list all files that start with `three`

`ls -l three* | wc -l` -> count how many files start with `three`

`cp three0? ../target_directory` -> copy all files that start with `three0` to the target directory


`mv file_name ../target_directory` -> move the file to the target directory
`mv directory_name ../target_directory` -> move the directory to the target directory
`mv anotherdir newdir` -> rename the directory `anotherdir` to `newdir`