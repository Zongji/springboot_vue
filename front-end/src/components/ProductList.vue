<template>
    <div id="product-list">

    </div>    
</template>

<script>
import axios from "axios"
export default {
  name: 'ProductList',
  props: {
    msg: String
  },
  data:function(){
    
  },
  created() {
    axios.get("/products")
    .then(res => {
        console.info(res);
    }).catch(err => {
        console.error(err);
    })

  },

}
</script>

<style scoped>

</style>