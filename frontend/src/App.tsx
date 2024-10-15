import './App.css'
import axios from "axios";
import {useState} from "react";

function App() {
    const [response, setResponse] = useState<string>("")

    axios.get("/api").then(
        (result) => setResponse(result.data)
    ).catch(
        () => setResponse("something went wrong")
    )

    return (
        <>
            <h1>{response}</h1>
        </>
    )
}

export default App
