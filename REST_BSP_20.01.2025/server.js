const express = require("express");
const bodyParser = require("body-parser");

const app = express();
app.use(bodyParser.urlencoded({extended:false}));
app.use(bodyParser.json());
const port = 3000;

const data  = [
   {name: "Hanna", age: 19},
   {name: "Michael", age: 20},
   {name: "Zoey", age: 19},
   {name: "Kimi", age: 43},
]


app.get("/people/:id",(req, res)=>{
   console.log(req.params.id)
   res.send(data[id]);
})



app.post("/people", (req, res)=>{
   data.push(req.body);

   res.send(req.body);
})


app.listen(port,()=>{
   console.log("Server running on port: " + port) 
}

)
