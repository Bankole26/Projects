var budgetController = (function(){
    
   var expense = function (id, description, value){
   this.id = id;
   this.description = description;
   this.value = value;
   };
    
    
   var income = function (id, description, value){
   this.id = id;
   this.description = description;
   this.value = value;
   };
     



var data = {
    allItems: {
    exp:[],
    inc:[]
    },
    totals: {
        exp:0,
        inc:0
    }
    };

    
    return {
        addItem : function(type, des, val) {
            var newItem, ID;
            
            //[1 2 3 4 5], next ID = 6
            //[1 2 4 6 8], next ID = 9
            // ID = last ID + 1
            
            // Create new ID
            if (data.allItems[type].length > 0) {
                ID = data.allItems[type][data.allItems[type].length - 1].id + 1;
            } else {
                ID = 0;
            }
            
            // Create new item based on 'inc' or 'exp' type
            if (type === 'exp') {
                newItem = new Expense(ID, des, val);
            } else if (type === 'inc') {
                newItem = new Income(ID, des, val);
            }
            
            // Push it into our data structure
            data.allItems[type].push(newItem);
            
            // Return the new element
            return newItem;
        },
        testing: function() {
            console.log(data);
        }
    };
    
})();

var UIController = (function(){
    
    var  DOMstrings = {
        inputType: '.add__type',
        inputDescription:'.add__description',
        inputValue:'.add__value',
        inputBtn:'.add__btn',
        inputContainer: '.income__list',
        expensesContainer: '.expenses__list'

    };
    
    return{
        getinput:function(){
            return{
            
             type: document.querySelector(DOMstrings.inputType).value,
             description: document.querySelector(DOMstrings.inputDescription).value,
             value: document.querySelector(DOMstrings.inputValue).value
            };
        },
        addListItem: function(obj, type){
            var html,newHtml,element;
            
            if(type==='inc'){
                element = DOMstrings.inputContainer;
           html = '<div class="item clearfix" id="income-%id%"> <div class="item__description">%description%</div><div class="right clearfix"> <div class="item__value">%value%</div> <div class="item__delete"> <button class="item__delete--btn"><i class="ion-ios-close-outline"></i></button></div></div></div>'
            
            }else if(type ==='exp'){
                element = DOMstrings.expensesContainer;
            html = '<div class="item clearfix" id="expense-%id%"><div class="item__description">%description%</div><div class="right clearfix"><div class="item__value">%value%</div><div class="item__percentage">21%</div><div class="item__delete"><button class="item__delete--btn"><i class="ion-ios-close-outline"></i></button></div></div></div>'
            }
            
            newHtml = html.replace('%id%',obj.id);
            newHtml = newhtml.replace('%description%',obj.description);
            newHtml = newhtml.replace('%value%',obj.value);
            document.querySelector(element).insertAdjacentHTML('beforeend',newHtml);


            
        },
        getDomstrings: function(){
            return DOMstrings;
        }
        
    };
    
})();

var controller = (function(budgetCtrl, UICtrl){
    
    var setupEventListeners = function() {
        var DOM = UICtrl.getDomstrings();
        
        document.querySelector(DOM.inputBtn).addEventListener('click', ctrlAddItem);
    
    document.addEventListener('keypress',function(event){
        if(event.keyCode===13 || event.which===13){
            ctrlAddItem();
        }
        
    });
        
    };
    
    
    
    var ctrlAddItem = function(){
        var input, newItem;
        
        input = UICtrl.getinput();
        
        newItem = budgetCtrl.addItem(input.type, input.description, input.value);
        
        UICtrl.addListItem(newItem, input.type);
        
    };
    
    return {
        init: function(){
            console.log('application started');
            setupEventListeners();
        }
    };
    
})(budgetController,UIController);

controller.init();