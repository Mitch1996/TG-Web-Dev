import React, { useState, useEffect } from 'react'
import axios from 'axios'
import AddUser from "./AddUser";
import 'semantic-ui-css/semantic.min.css'

export default function Users() {
   const [users, setUsers] = useState('')
   const [toevoegenBool, setToevoegenBool] = useState(false)
   const [wijzigenBool, setWijzigenBool] = useState('')
   useEffect(() => {
      getApi()
   }, [])
   const url = "localhost:8080/api/v1/users/"
   const onchange = (e) => {
   }
   const onclick = (id) => {
      axios.delete(url + id)
         .then(() => {
            let arr = users.filter(user => user.id != id)
            console.log(arr)
            setUsers(arr)
         })
   }
   const getApi = () => {
      fetch(url)
         .then(res => res.json())
         .then(data => {
            console.log(data)
            setUsers(data)
         })
         .catch(err => console.log(err))
   }
   return (
      <div>
         <AddUser users={users} setUsers={setUsers} />}
      </div>
   )
}
