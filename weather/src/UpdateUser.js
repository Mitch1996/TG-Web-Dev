import React, { useState, useEffect } from 'react'
import axios from 'axios'
import { Form } from 'semantic-ui-react'

export default function UpdateUser(props) {
   const [user, setUser] = useState({
      firstName: props.user.firstName,
      lastName: props.user.lastName,
      age: props.user.age
   })
   const url = "localhost:8080/api/v1/users/"
   const onchange = (e) => {
      setUser({ ...user, [e.target.name]: e.target.value })
   }
   const onclick = () => {
      console.log(user)
      axios.put(url + props.user.id, user)
         .then((res) => {
            console.log(res.data)
            let arr = props.users.map(user => {
               if (user.id == props.user.id)
                  return res.data
               else
                  return user
            })
            console.log(arr)
            props.setUsers(arr)
            props.setWijzigenBool('')
         })
   }
   return (
      <div>
         <Form>
            <Form.Group widths='equal'>
               <Form.Input fluid label='First name' placeholder='First name' />
               <Form.Input fluid label='Last name' placeholder='Last name' />
            </Form.Group>
            <Form.TextArea label='About' placeholder='Tell us more about you...' />
            <Form.Checkbox label='I agree to the Terms and Conditions' />
            <Form.Button>Submit</Form.Button>
         </Form>
         {/*<input onChange={onchange} value={user.firstName} name='firstName'/>*/}
         {/*<input onChange={onchange} value={user.lastName} name='lastName'/>*/}
         {/*<input onChange={onchange} value={user.age} name='age'/>*/}
         {/*<button onClick={() => onclick()}>wijzigen</button>*/}
         {/*<button onClick={() => { props.setWijzigenBool('') }}>annuleren</button>*/}
      </div>
   )
}
