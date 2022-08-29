## Don't put a custom date just do it using methods .
# why ?
 - doing it that way prevent your website to be outdated .
 - if there is any logic related to time or date it's going to break new year when the time change ...etc.
 
 ```
 // 1- Create an obj from Date.
 const currentYear = new Date().getFullYear();
// 2- put it in your components.
const footer = () => {
  return (
      <div>
  Divzoon &copy;  {currentYear} - 2018
  </div>
  );
};
 
export default footer;
 
 ```
