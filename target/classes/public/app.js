Vue.component('topics',{
	template:`
		<ul>
			<li v-for="topic in topics">{{topic.name}}</li>
		</ul>
	`,
	data(){
		return {
			topics:[]
		}
	},
	mounted(){
		this.fetchTopics();
	},
	methods:{
		fetchTopics: function(){
			axios.get('/topics').then(function(response){
				this.topics = response.data;
			}.bind(this));
		}
	}
});

var app = new Vue({
	el:'#app',
	template:`
		<topics></topics>
	`
})