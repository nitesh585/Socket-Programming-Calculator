# Socket-Programming-Calculator

### To run on Terminal or Command Prompt
Open two windows one for Server and another for Client

+ First run the Server application as ,

  + `$ java Server`

Server started
Waiting for a client …

+ Then run the Client application on another terminal as,

  + `$ java Client`

It will show – Connected and the server accepts the client and shows,

Client accepted

+ Then you can start typing messages i.e binary operation  in the Client window. Here is a sample input to the Client
<br>`4 + 5` <br>
`4 - 5` <br>
`4 * 5` <br>
`4 / 5` <br>

+ Which the Server simultaneously receives -> compute the result and shows,
<br>`9`<br>
`-1`<br>
`20`<br>
`0`<br>

exit <br>
Closing connection

Notice that sending “exit” closes the connection between the Client and the Server.<br>
For More Info [link](https://www.javatpoint.com/socket-programming)
