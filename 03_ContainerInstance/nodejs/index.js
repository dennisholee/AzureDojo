const express = require("express")
const app = express()

var PORT = process.env.PORT || 3000

app.get("/", (req, rsp) => {
    rsp.status(200).send("OK")
})

app.listen(PORT, () => console.log(`Listening on port ${PORT}.`))

