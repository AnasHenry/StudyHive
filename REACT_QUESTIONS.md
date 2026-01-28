# ⚛️ React Interview Questions & Answers

---

## 1️⃣ React Basics

### Q1. What is React?
**Answer:**  
React is a JavaScript library for building fast and interactive user interfaces using a component-based architecture and a virtual DOM.

---

### Q2. Why use React / Advantages of using React?
**Answer:**
- Component reusability
- Virtual DOM for performance
- Declarative UI
- Strong ecosystem
- One-way data flow

---

### Q3. What is Virtual DOM?
**Answer:**  
The Virtual DOM is an in-memory representation of the real DOM. React updates the Virtual DOM first, compares changes (diffing), and updates only the required parts of the real DOM.

---

## 2️⃣ Components & JSX

### Q4. What is a component?
**Answer:**  
A component is an independent, reusable piece of UI.  
Types:
- Functional Components
- Class Components (legacy)

---

### Q5. What is JSX?
**Answer:**  
JSX is a syntax extension that allows writing HTML-like code inside JavaScript.

```jsx
const element = <h1>Hello World</h1>;

```
---

### Q6. Can browsers understand JSX?
**Answer:** 
No. JSX is transpiled to JavaScript using Babel.

---

## 3️⃣ Props & State

### Q7. What are props?
**Answer:** 
The props in React are the inputs to a component of React. They can be single-valued or objects having a set of values that will be passed to components of React during creation by using a naming convention that almost looks similar to HTML-tag attributes. We can say that props are the data passed from a parent component into a child component.

```jsx
<Component name="React" />

```

---

### Q8. What is state?
**Answer:** 
Every component in react has a built-in state object, which contains all the property values that belong to that component. In other words, the state object controls the behaviour of a component. Any change in the property values of the state object leads to the re-rendering of the component.
> Note- State object is not available in functional components but, we can use React Hooks to add state to a functional component.
---

### Q9. Differennce between state and props.
**Answer:**
| Props              |          State           |
| ------------------ | :----------------------: |
| Immutable          |         Mutable          |
| Passed from parent | Managed inside component |
| Read-only          |      Can be updated      |


---

## 4️⃣ Hooks

### Q10. What are Hooks?
**Answer:** 
React Hooks are the built-in functions that permit developers for using the state and lifecycle methods within React components. Each lifecycle of a component is having 3 phases which include mount, unmount, and update. Along with that, components have properties and states. Hooks will allow using these methods by developers for improving the reuse of code with higher flexibility navigating the component tree.
> Using Hook, all features of React can be used without writing class components.

---

### Q11. What is useState?
**Answer:**
The useState() is a built-in React Hook that allows you for having state variables in functional components. It should be used when the DOM has something that is dynamically manipulating/controlling.
```jsx
const [count, setCount] = useState(0);
```

---

### Q12. What is useEffect?
**Answer:**
The useEffect React Hook is used for performing the side effects in functional components. With the help of useEffect, you will inform React that your component requires something to be done after rendering the component or after a state change. The function you have passed(can be referred to as “effect”) will be remembered by React and call afterwards the performance of DOM updates is over. Using this, we can perform various calculations such as data fetching, setting up document title, manipulating DOM directly, etc, that don’t target the output value. The useEffect hook will run by default after the first render and also after each update of the component. React will guarantee that the DOM will be updated by the time when the effect has run by it.

```jsx
useEffect(() => {
console.log("Component mounted");
}, []);
```

---

### Q13. Dependency array in useEffect?
**Answer:**
It controls when the effect runs:
* No array -> every render
* Empty array -> once on mount
* With values -> when value change
  
---

### Q14. What is cleanup in useEffect?
**Answer:**
Used to remove subscriptions or listeners to avoid memory leaks.
```jsx
useEffect(() => {
  return () => cleanup();
}, []);
```

---

## 5️⃣ Lifecycle & Rendering

### Q15. When does React re-render?
**Answer:**
React re-renders when:
* State changes
* Props change
* Parent component re-renders
  
---

### Q16. What is reconciliation?
**Answer:**
The process where React compares old and new Virtual DOM trees to update the real DOM efficiently.

---

## 6️⃣ Performance Optimization

### Q17. What is React.memo?
**Answer:**
Prevents unnecessary re-renders by memoizing a component.

---

### Q18. What is UseMemo()?
**Answer:**
Memoizes expensive calculations so that it doesn't have to calculated again for each render.

---

### Q19. What is useCallback?
**Answer:**
Memoizes functions to prevent re-creation on every render.

---

## 7️⃣ Advanced Concepts

### Q20. What is Context API?
**Answer:**
Used to avoid prop drilling by sharing data globally.

---

### Q21. What is prop drilling?
**Answer:**
Passing props through multiple levels unnecessarily between components.

---

### Q22. Controlled vs Uncontrolled Components?
**Answer:**
| Controlled           |    Uncontrolled    |
| -------------------- | :----------------: |
| React controls state | DOM controls state |
| Uses useState        |      Uses ref      |

---

### Q23. What are keys in React?
**Answer:**
A key is a special string attribute that needs to be included when using lists of elements.
```jsx
const ids = [1,2,3,4,5];
const listElements = ids.map((id)=>{
return(
<li key={id.toString()}>
  {id}
</li>
)
})
```
Importance of Keys:
* Keys help react identify which elements were added, changed or removed.
* Keys should be given to array elements for providing a unique identity for each element.
* Without keys, React does not understand the order or uniqueness of each element.
* With keys, React has an idea of which particular element was deleted, edited, and added.
* Keys are generally used for displaying a list of data coming from an API.
---

## 8️⃣ Common Interview Scenarios

### Q24. Why shouldn’t we manipulate the DOM directly in React?
**Answer:**
Direct DOM manipulation bypasses React’s Virtual DOM and can cause UI inconsistencies.

---

### Q25. How to prevent infinite loops in useEffect?
**Answer:**
* Use proper dependency array
* Avoid updating dependent state inside the effect unnecessarily
  
---

### Q26. What is lifting state up?
**Answer:**
Moving shared state to the closest common parent to synchronize child components.

---

### Q27. What are the limitations of React?
**Answer:**
* React is not a full-blown framework as it is only a library.
* The components of React are numerous and will take time to fully grasp the benefits of all.
* Coding might become complex as it will make use of inline templating and JSX.
  
---

### Q28. What is JSX?
**Answer:**
JSX stands for JavaScript XML. It allows us to write HTML inside JavaScript and place them in the DOM without using functions like appendChild( ) or createElement( ).

As stated in the official docs of React, JSX provides syntactic sugar for React.createElement( ) function.

> Note- We can create react applications without using JSX as well.

Without using JSX, we would have to create an element by the following process:
```jsx
const text = React.createElement('p', {}, 'This is a text');
const container = React.createElement('div','{}',text );
ReactDOM.render(container,rootElement);
```

Using JSX,
```jsx
const container = (
<div>
  <p>This is a text</p>
</div>
);
ReactDOM.render(container,rootElement);
```

---

### Q29. What are the differences between functional and class components?
**Answer:**
| Feature       | Functional Component | Class Component   |
| ------------- | -------------------- | ----------------- |
| Syntax        | JavaScript function  | ES6 class         |
| State         | useState Hook        | this.state        |
| Lifecycle     | useEffect            | Lifecycle methods |
| this keyword  | Not used             | Required          |
| Boilerplate   | Minimal              | More verbose      |
| Performance   | Slightly better      | Slightly heavier  |
| Reusability   | Easier with Hooks    | Harder            |
| Readability   | Cleaner              | More complex      |
| Current Usage | Preferred            | Legacy            |

---

### Q30. Document Object Model.
**Answer:**
![DOM.](https://d3n0h9tb65y8q.cloudfront.net/public_assets/assets/000/002/334/original/virtual_DOM.png?1640091398)

---

### Q31. What are the differences between controlled and uncontrolled components?
**Answer:**
* **Controlled component:** In a controlled component, the value of the input element is controlled by React. We store the state of the input element inside the code, and by using event-based callbacks, any changes made to the input element will be reflected in the code as well.
* **Uncontrolled Component:** In an uncontrolled component, the value of the input element is handled by the DOM itself. Input elements inside uncontrolled components work just like normal HTML input form elements.The state of the input element is handled by the DOM. Whenever the value of the input element is changed, event-based callbacks are not called. Basically, react does not perform any action when there are changes made to the input element.

| Feature                               | Uncontrolled | Controlled |
| ------------------------------------- | ------------ | ---------- |
| One-time value retrieval              | Yes          | Yes        |
| Validating on submit                  | Yes          | Yes        |
| Field-level Validation                | No           | Yes        |
| Conditionally disabling submit button | No           | Yes        |
| Enforcing input format                | No           | Yes        |
| several inputs for one piece of data  | No           | Yes        |
| dynamic inputs                        | No           | Yes        |

---

### Q32. Explain about types of side effects in React component.
**Answer:**
* **Effects without Cleanup:** This side effect will be used in useEffect which does not restrict the browser from screen update. It also improves the responsiveness of an application. A few common examples are network requests, Logging, manual DOM mutations, etc.
* **Effects with Cleanup:** Some of the Hook effects will require the cleanup after updating of DOM is done. For example, if you want to set up an external data source subscription, it requires cleaning up the memory else there might be a problem of memory leak. It is a known fact that React will carry out the cleanup of memory when the unmounting of components happens. But the effects will run for each render() method rather than for any specific method. Thus we can say that, before execution of the effects succeeding time the React will also cleanup effects from the preceding render.
  
---

### Q33. What is prop drilling in React?
**Answer:**
Sometimes while developing React applications, there is a need to pass data from a component that is higher in the hierarchy to a component that is deeply nested. To pass data between such components, we pass props from a source component and keep passing the prop to the next component in the hierarchy till we reach the deeply nested component.

The disadvantage of using prop drilling is that the components that should otherwise be not aware of the data have access to the data.
![DOM](https://d3n0h9tb65y8q.cloudfront.net/public_assets/assets/000/002/340/original/What_is_prop_drilling_in_React.png?1640091757)

---

### Q34. What are the rules that must be followed while using React Hooks?
**Answer:**
* React Hooks must be called only at the top level. It is not allowed to call them inside the nested functions, loops, or conditions.
* It is allowed to call the Hooks only from the React Function Components.

---

### Q35. Why do React Hooks make use of refs?
**Answer:**
* Managing focus, media playback, or text selection.
* Integrating with DOM libraries by third-party.
* Triggering the imperative animations.
  
---

### Q36. What are Custom Hooks?
**Answer:**
A Custom Hook is a function in Javascript whose name begins with ‘use’ and which calls other hooks. It is a part of React v16.8 hook update and permits you for reusing the stateful logic without any need for component hierarchy restructuring.

In almost all of the cases, custom hooks are considered to be sufficient for replacing render props and HoCs (Higher-Order components) and reducing the amount of nesting required. Custom Hooks will allow you for avoiding multiple layers of abstraction or wrapper hell that might come along with Render Props and HoCs.

The disadvantage of Custom Hooks is it cannot be used inside of the classes.

---

### Q37. What is React Router?
**Answer:**
React Router refers to the standard library used for routing in React. It permits us for building a single-page web application in React with navigation without even refreshing the page when the user navigates. It also allows to change the browser URL and will keep the user interface in sync with the URL. React Router will make use of the component structure for calling the components, using which appropriate information can be shown. Since React is a component-based framework, it’s not necessary to include and use this package. Any other compatible routing library would also work with React.

The major components are:
* **BrowserRouter:** It is a router implementation that will make use of the HTML5 history API (pushState, popstate, and event replaceState) for keeping your UI to be in sync with the URL. It is the parent component useful in storing all other components.
* **Routes:** It is a newer component that has been introduced in the React v6 and an upgrade of the component.
* **Route:** It is considered to be a conditionally shown component and some UI will be rendered by this whenever there is a match between its path and the current URL.
* **Link:** It is useful in creating links to various routes and implementing navigation all over the application. It works similarly to the anchor tag in HTML
  
---

### Q38. How the jsx file is converted into js file?
**Answer:**
Browsers can’t understand JSX directly. Instead, tools like Babel transpile it into plain JavaScript using React.createElement().
```jsx
const element = <h1>Hello, World!</h1>;
```
Babel converts it into:
```jsx
const element = React.createElement("h1", null, "Hello, World!");
```

---





