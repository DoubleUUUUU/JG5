const express = require("express")


const app = express();
const port = 3000;

const data  = [
   {name: "Hanna", age: 19},
   {name: "Michael", age: 20},
   {name: "Zoey", age: 19},
   {name: "Kimi", age: 43},
]


app.get("/people",(req, res)=>{
    res.send(data);
})

app.listen(port,()=>{
   console.log("Server running on port: " + port) 
}

)
