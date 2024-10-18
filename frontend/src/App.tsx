import './App.css'
import axios from "axios";
import {useState} from "react";

import {ToastContainer, toast} from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';

function App() {
    const [response, setResponse] = useState<string>("")

    axios.get("/api/hello").then(
        (result) => setResponse(result.data)
    ).catch(
        () => setResponse("something went wrong")
    )

    const loadUser = () => {
        axios.get('/api/auth/me')
            .then(response => {
                console.log(response.data)
                toast(response.data)
            })
    }

    function login() {
        const host = window.location.host === 'localhost:5173' ? 'http://localhost:8080' : window.location.origin
        const oAuth2Url = host + '/oauth2/authorization/github'

        window.open(oAuth2Url, '_self')
    }

    return (
        <>
            <h1>{response}</h1>

            <h2>Auth</h2>

            <button onClick={login}>Login</button>
            <button onClick={loadUser}>Get Me</button>

            <ToastContainer/>

        </>
    )
}

export default App
