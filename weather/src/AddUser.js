import React, {useState, useEffect} from 'react'
import axios from 'axios'
import {Form, Container, Grid, Rating, Message} from 'semantic-ui-react'

export default function AddUser(props) {
   let [active, setActive] = useState()
   const [msg, setMsg] = useState('')
   const [user, setUser] = useState('')
   const url = "http://localhost:8080/api/v1/users/"
   const handleChange = (e, {name, value}) => this.setState({[name]: value})
   const onchange = (e) => {
      setUser({...user, [e.target.name]: e.target.value})
   }
   const onclick = () => {
      axios.post(url, user)
         .then((res) => {
            setMsg(res.data)
            setUser('')
            setActive(false)
            setInterval(() => {
               setMsg(null)
            }, 3000);
         })
   }
   return (
      <Container>
         <div>
            <div>
               <Grid>
                  <Grid.Row centered>
                     <Grid.Column width={8}>
                        <Form success={msg ? 'success' : null} size="small">
                           <Form.Group widths='equal'>
                              <Form.Input value={user && user.firstName} onChange={onchange} fluid label='First name'
                                          placeholder='First name' name='firstName'/>
                              <Form.Input value={user && user.lastName} onChange={onchange} fluid label='Last name'
                                          placeholder='Last name' name='lastName'/>
                           </Form.Group>
                           <Form.Group widths='equal'>
                              <Form.Input value={user && user.email} onChange={onchange} fluid label='Email'
                                          placeholder='Email' name='email'/>
                              <Form.Input value={user && user.password} onChange={onchange} fluid label='password'
                                          placeholder='password' name='password'/>
                              <Form.Input value={user && user.sterren} onChange={onchange} fluid label='Sterren'
                                          placeholder='Sterren' name='sterren'/>
                           </Form.Group>
                           <Form.TextArea value={user && user.ervaring} onChange={onchange} label='Feedback' placeholder='Feedback' name='ervaring'/>
                           <Form.Checkbox checked={active} label='I agree to the Terms and Conditions'/>
                           <Message
                              success
                              header='Form Completed'
                              content={msg}
                           />
                           <Form.Button onClick={ () => onclick()}>Submit</Form.Button>
                        </Form>
                     </Grid.Column>
                  </Grid.Row>
               </Grid>
            </div>
         </div>
      </Container>
   )
}
